package cn.knightzz.design.factory.abs.chapter01.service.impl;

import cn.knightzz.design.factory.abs.chapter01.cache.EGM;
import cn.knightzz.design.factory.abs.chapter01.cache.IIR;
import cn.knightzz.design.factory.abs.chapter01.cache.RedisUtils;
import cn.knightzz.design.factory.abs.chapter01.service.CacheService;

import java.util.concurrent.TimeUnit;

/**
 * @author 王天赐
 * @title CacheServiceImpl
 * @description
 * @create 2023-10-27 12:05
 */
public class CacheServiceImpl implements CacheService {

    RedisUtils redisUtils = new RedisUtils();

    EGM egm = new EGM();

    IIR iir = new IIR();

    @Override
    public String get(String key, Integer cacheType) {

        if (1 == cacheType) {
            return redisUtils.get(key);
        } else if (2 == cacheType) {
            return egm.gain(key);
        }else  {
            return iir.get(key);
        }
    }

    @Override
    public void set(String key, String value, Integer cacheType) {
        if (1 == cacheType) {
            redisUtils.set(key, value);
        } else if (2 == cacheType) {
            egm.set(key, value);
        }else  {
            iir.set(key, value);
        }
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit, Integer cacheType) {
        if (1 == cacheType) {
            redisUtils.set(key, value, timeout, timeUnit);
        } else if (2 == cacheType) {
            egm.setEx(key, value, timeout, timeUnit);
        }else  {
            iir.setExpire(key, value, timeout, timeUnit);
        }
    }

    @Override
    public void del(String key, Integer cacheType) {
        if (1 == cacheType) {
            redisUtils.del(key);
        } else if (2 == cacheType) {
            egm.del(key);
        }else  {
            iir.del(key);
        }
    }
}
