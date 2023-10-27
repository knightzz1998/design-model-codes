package cn.knightzz.design.factory.abs.chapter02.utils;

/**
 * @author 王天赐
 * @title ClassLoaderUtils
 * @description
 * @create 2023-10-27 21:29
 */
public class ClassLoaderUtils {

    public static Class<?>[] getClazzByArgs(Object[] args) {
        Class<?>[] parametersTypes = new Class[args.length];
        for (int i = 0; i < args.length; i++) {
            parametersTypes[i] = args.getClass();
        }
        return parametersTypes;
    }
}
