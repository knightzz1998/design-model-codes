package cn.knightzz.design.strategy.chapter02.event;

import cn.knightzz.design.strategy.chapter02.ICouponDiscount;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author 王天赐
 * @title MJCouponDiscount
 * @description 满减折扣策略
 * @create 2023-10-31 22:01
 */
public class MJCouponDiscount implements ICouponDiscount<Map<String, String>> {


    @Override
    public BigDecimal discountAmount(Map<String, String> couponInfo, BigDecimal skuPrice) {

        // 1. 满 x - n 元
        String x = couponInfo.get("x");
        String n = couponInfo.get("n");

        // skuPrice - x < 0
        if (skuPrice.compareTo(new BigDecimal(x)) < 0) {

        }

        return null;
    }
}
