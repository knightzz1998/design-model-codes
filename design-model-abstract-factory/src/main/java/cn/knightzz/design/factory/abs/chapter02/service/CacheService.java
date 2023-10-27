package cn.knightzz.design.factory.abs.chapter02.service;

import java.util.concurrent.TimeUnit;

/**
 * @author 王天赐
 * @title CacheService
 * @description 定义缓存接口
 * @create 2023-10-27 11:58
 */
public interface CacheService {
    String get(final String key, Integer cacheType);

    void set(String key, String value, Integer cacheType);

    void set(String key, String value, long timeout, TimeUnit timeUnit, Integer cacheType);

    void del(String key, Integer cacheType);
}
