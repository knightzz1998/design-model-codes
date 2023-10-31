package cn.knightzz.design.strategy.chapter01.service;

/**
 * @author 王天赐
 * @title CouponDiscountService
 * @description
 * @create 2023-10-31 17:59
 */
public interface CouponDiscountService {

    /**
     * 折扣的后的金额
     * @param type 优惠券类型
     * @param typeContent
     * @param skuPrice
     * @param typeExt
     * @return
     */
    double discountAmount(int type, double typeContent, double
            skuPrice, double typeExt);
}
