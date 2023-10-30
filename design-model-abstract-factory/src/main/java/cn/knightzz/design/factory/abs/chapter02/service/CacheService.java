package cn.knightzz.design.factory.abs.chapter02.service;

import java.util.concurrent.TimeUnit;

/**
 * @author 王天赐
 * @title CacheService
 * @description 定义缓存接口
 * @create 2023-10-27 11:58
 */
public interface CacheService {
    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}