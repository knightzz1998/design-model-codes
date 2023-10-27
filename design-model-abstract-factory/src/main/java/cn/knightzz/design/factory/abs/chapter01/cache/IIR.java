package cn.knightzz.design.factory.abs.chapter01.cache;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * @author 王天赐
 * @title IIRCache
 * @description 模拟集群
 * @create 2023-10-27 11:09
 */
@Slf4j
public class IIR {

    private final Map<String, String> dataMap = new ConcurrentHashMap<>();

    public String get(String key) {
        log.info("IIR获取数据 key: {} ", key);
        return dataMap.get(key);
    }

    public void set(String key, String value) {

        log.info("IIR添加数据 key: {}, value: {}", key, value);
        dataMap.put(key, value);
    }

    public void setExpire(String key, String value, long timeout, TimeUnit unit) {
        log.info("IIR添加数据 key: {}, value: {}, timeout: {}, timeUnit: {}", key, value, timeout, unit.toString());
        dataMap.put(key, value);
    }

    public void del(String key) {
        log.info("IIR删除数据 key: {} ", key);
        dataMap.remove(key);
    }
}
