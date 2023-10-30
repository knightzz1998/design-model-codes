package cn.knightzz.design.factory.abs.chapter02.service.impl;

import cn.knightzz.design.factory.abs.chapter02.cache.EGM;
import cn.knightzz.design.factory.abs.chapter02.cache.IIR;
import cn.knightzz.design.factory.abs.chapter02.cache.RedisUtils;
import cn.knightzz.design.factory.abs.chapter02.service.CacheService;

import java.util.concurrent.TimeUnit;

/**
 * @author 王天赐
 * @title CacheServiceImpl
 * @description
 * @create 2023-10-27 12:05
 */
public class CacheServiceImpl implements CacheService {

    RedisUtils redisUtils = new RedisUtils();

    @Override
    public String get(String key) {

        return redisUtils.get(key);
    }

    @Override
    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        redisUtils.del(key);
    }
}
