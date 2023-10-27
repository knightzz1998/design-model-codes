package cn.knightzz.design.factory.abs.chapter02.adapter.impl;

import cn.knightzz.design.factory.abs.chapter02.adapter.ICacheAdapter;
import cn.knightzz.design.factory.abs.chapter02.cache.EGM;

import java.util.concurrent.TimeUnit;

/**
 * @author 王天赐
 * @title EGMCacheAdapter
 * @description
 * @create 2023-10-27 20:24
 */
public class EGMCacheAdapter implements ICacheAdapter {

    EGM egm = new EGM();

    @Override
    public String get(String key) {
        return egm.gain(key);
    }

    @Override
    public void set(String key, String value) {
        egm.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setEx(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        egm.del(key);
    }
}
