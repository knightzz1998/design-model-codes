package cn.knightzz.design.factory.abs.chapter02.adapter;

import java.util.concurrent.TimeUnit;

/**
 * @author 王天赐
 * @title ICacheAdapter
 * @description 适配器
 * @create 2023-10-27 20:33
 */
public interface ICacheAdapter {

    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
