package cn.knightzz.design.proxy.dynamic_proxy;

import cn.knightzz.design.proxy.static_proxy.ProxySell;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 王天赐
 * @title ProxyFactory
 * @description
 * @create 2024-02-16 10:38
 */
@Slf4j
public class ProxyFactory {

    /**
     * 声明代理的目标对象
     */
    private Shop shop = new Shop();

    public SellFood getProxyObject() {

        /**
         * newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
         * loader : 被代理的对象 Shop 的 类加载器,
         * interfaces : 被代理的对象 Shop 的 接口
         * InvocationHandler : 代理对象的调用处理类
         */
        SellFood sellFood = (SellFood) Proxy.newProxyInstance(
                shop.getClass().getClassLoader(),
                shop.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        log.info("代理对象调用方法开始");
                        method.invoke(shop, args);
                        log.info("代理对象调用方法结束");
                        return proxy;
                    }
                });
        return sellFood;
    }

    // 判断Object数组是什么类型的
    public void checkType(Object args) {
        if (args instanceof String) {
            // 处理String类型
        } else if (args instanceof Integer) {
            // 处理Integer类型
        } else if (args instanceof Double) {
            // 处理Double类型
        } else if (args instanceof Float) {
            // 处理Float类型
        } else if (args instanceof Long) {
            // 处理Long类型
        } else if (args instanceof Short) {
            // 处理Short类型
        } else if (args instanceof Character) {
            // 处理Character类型
        } else if (args instanceof Byte) {
            // 处理Byte类型
        } else if (args instanceof Boolean) {
            // 处理Boolean类型
        } else if (args instanceof Void) {
            // 处理Void类型
        } else {
            // 处理其他类型
        }
    }
}
