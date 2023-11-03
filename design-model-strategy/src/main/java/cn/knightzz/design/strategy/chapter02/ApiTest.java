package cn.knightzz.design.strategy.chapter02;

import cn.knightzz.design.strategy.chapter02.event.MJCouponDiscount;
import cn.knightzz.design.strategy.chapter02.event.ZJCouponDiscount;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 王天赐
 * @title ApiTest
 * @description
 * @create 2023-11-03 16:37
 */
public class ApiTest {

    @Test
    public void test01() {

        DiscountContext<Double> context = new DiscountContext<>(new ZJCouponDiscount());
        context.discountAmount(30D, new BigDecimal(100));
    }

    @Test
    public void test02() {
        DiscountContext<Map<String, String>> context = new DiscountContext<>(new MJCouponDiscount());
        Map<String, String> extendMap = new HashMap<>();
        extendMap.put("x", "100");
        extendMap.put("n", "30");
        context.discountAmount(extendMap, new BigDecimal(100));
    }

}
