package cn.knightzz.design.factory.abs.chapter02.adapter;

import cn.knightzz.design.factory.abs.chapter02.utils.ClassLoaderUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 王天赐
 * @title JDKInvocationHandler
 * @description
 * @create 2023-10-27 20:25
 */
public class JDKInvocationHandler {

    private ICacheAdapter cacheAdapter;

    public JDKInvocationHandler(ICacheAdapter cacheAdapter) {
        this.cacheAdapter = cacheAdapter;
    }

    /**
     * 代理方法调用
     * @param proxy 代理对象
     * @param method 代理方法对象
     * @param args 被调用的方法参数
     * @return
     */
    public Object invoke(Object proxy, Method method, Object[] args)
            throws
            NoSuchMethodException,
            InvocationTargetException,
            IllegalAccessException {
        return ICacheAdapter.class.getMethod(method.getName(),  ClassLoaderUtils.getClazzByArgs(args)).invoke(proxy, args);
    }
}
