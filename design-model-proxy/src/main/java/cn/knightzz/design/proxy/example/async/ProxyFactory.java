package cn.knightzz.design.proxy.example.async;


import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 王天赐
 * @title ProxyFactory
 * @description
 * @create 2024-02-17 20:38
 */
@Slf4j
public class ProxyFactory {

    OrderServiceImpl orderService = new OrderServiceImpl();

    public OrderService createOrderServiceProxy() {

        OrderService orderServiceProxy = (OrderService) Proxy.newProxyInstance(
                orderService.getClass().getClassLoader(),
                orderService.getClass().getInterfaces(),
                new InvocationHandler() {
                    // 这里的 method 是接口中定义的, 而不是具体实现类的
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        // 根据接口信息查找到目标对象的方法
                        Method targetMethod = orderService.getClass().getMethod(method.getName(), method.getParameterTypes());

                        // 如果方法带有 @AsyncExt 注解
                        if (targetMethod.isAnnotationPresent(AsyncExt.class)) {
                            // 异步调用
                            new Thread(() -> {
                                try {
                                    log.info("异步调用");
                                    method.invoke(orderService, args);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }).start();
                        } else {
                            // 同步调用
                            log.info("同步调用");
                            method.invoke(orderService, args);
                        }
                        return proxy;
                    }
                }
        );
        return orderServiceProxy;
    }
}
