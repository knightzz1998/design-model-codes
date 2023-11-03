package cn.knightzz.design.strategy.chapter02;

import java.math.BigDecimal;

/**
 * @author 王天赐
 * @title Context
 * @description
 * @create 2023-10-31 22:00
 */
public class DiscountContext<T> {

    private ICouponDiscount<T> couponDiscount;

    public DiscountContext(ICouponDiscount<T> couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice) {
        return couponDiscount.discountAmount(couponInfo, skuPrice);
    }
}
