package cn.knightzz.design.factory.abs.chapter01;

import cn.knightzz.design.factory.abs.chapter01.service.CacheService;
import cn.knightzz.design.factory.abs.chapter01.service.impl.CacheServiceImpl;
import org.junit.Test;

/**
 * @author 王天赐
 * @title CacheTest
 * @description
 * @create 2023-10-27 15:49
 */
public class CacheTest {

    @Test
    public void test(){
        CacheService service = new CacheServiceImpl();

        service.set("username", "admin", 1);
        service.get("username", 1);
    }

}
