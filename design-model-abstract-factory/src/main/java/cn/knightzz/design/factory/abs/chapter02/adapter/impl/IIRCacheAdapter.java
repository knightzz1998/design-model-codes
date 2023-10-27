package cn.knightzz.design.factory.abs.chapter02.adapter.impl;

import cn.knightzz.design.factory.abs.chapter02.adapter.ICacheAdapter;
import cn.knightzz.design.factory.abs.chapter02.cache.IIR;

import java.util.concurrent.TimeUnit;

/**
 * @author 王天赐
 * @title ICacheAdapter
 * @description
 * @create 2023-10-27 20:25
 */
public class IIRCacheAdapter implements ICacheAdapter {


    IIR cache = new IIR();

    @Override
    public String get(String key) {
        return cache.get(key);
    }

    @Override
    public void set(String key, String value) {
        cache.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        cache.setExpire(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        cache.del(key);
    }
}
