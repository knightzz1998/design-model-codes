package cn.knightzz.design.factory.abs.chapter02;

import cn.knightzz.design.factory.abs.chapter02.adapter.JDKProxy;
import cn.knightzz.design.factory.abs.chapter02.adapter.impl.EGMCacheAdapter;
import cn.knightzz.design.factory.abs.chapter02.adapter.impl.IIRCacheAdapter;
import cn.knightzz.design.factory.abs.chapter02.service.CacheService;
import cn.knightzz.design.factory.abs.chapter02.service.impl.CacheServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author 王天赐
 * @title ApiTest
 * @description
 * @create 2023-10-27 20:29
 */
@Slf4j
public class ApiTest {


    @Test
    public void test01() {
        // 通常情况下，动态代理生成的代理对象类型是接口类型，而不是具体的实现类类型。
        // 所以代理类返回的最好用接口类CacheService而不是 CacheServiceImpl
        CacheService proxy = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy.set("username", "root");
        proxy.get("username");

        CacheService proxy2 = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy2.set("username", "root");
        proxy2.get("username");

    }
}
