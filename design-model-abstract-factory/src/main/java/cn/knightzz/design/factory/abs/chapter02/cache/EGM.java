package cn.knightzz.design.factory.abs.chapter02.cache;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * @author 王天赐
 * @title EGMCache
 * @description 模拟集群
 * @create 2023-10-27 11:09
 */
@Slf4j
public class EGM {

    private final Map<String, String> dataMap = new ConcurrentHashMap<>();

    public String gain(String key) {
        log.info("EGM获取数据 key: {} ", key);
        return dataMap.get(key);
    }

    public void set(String key, String value) {

        log.info("EGM添加数据 key: {}, value: {}", key, value);
        dataMap.put(key, value);
    }

    public void setEx(String key, String value, long timeout, TimeUnit unit) {
        log.info("EGM添加数据 key: {}, value: {}, timeout: {}, timeUnit: {}", key, value, timeout, unit.toString());
        dataMap.put(key, value);
    }

    public void del(String key) {
        log.info("EGM删除数据 key: {} ", key);
        dataMap.remove(key);
    }
}
