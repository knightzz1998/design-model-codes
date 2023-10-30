package cn.knightzz.design.factory.abs.chapter02.adapter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author 王天赐
 * @title JDKProxy
 * @description
 * @create 2023-10-27 20:25
 */
public class JDKProxy {

    /**
     * 获取代理类对象
     * @param interfaceClass 被代理的类的Class对象
     * @param cacheAdapter 缓存适配器对象
     * @return 代理类对象
     * @param <T>
     */
    public static <T> T getProxy(Class<T> interfaceClass, ICacheAdapter cacheAdapter) {

        InvocationHandler handler = new JDKInvocationHandler(cacheAdapter);
        // 获取当前线程的上下文类加载器
        ClassLoader loader = Thread.currentThread().getContextClassLoader();


        // 获取class对象实现的接口Class
        Class<?>[] interfaces = interfaceClass.getInterfaces();
        // 创建代理对象
        return (T) Proxy.newProxyInstance(loader, new Class[]{interfaces[0]}, handler);
    }
}
