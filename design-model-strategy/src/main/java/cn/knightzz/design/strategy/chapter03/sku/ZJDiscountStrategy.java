package cn.knightzz.design.strategy.chapter03.sku;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author 王天赐
 * @title ZJCouponDiscount
 * @description 直减折扣策略
 * @create 2023-10-31 22:02
 */
@Slf4j
public class ZJDiscountStrategy implements IDiscountStrategy<Double> {

    /**
     * 直减计算
     * 1. 使用商品价格减去优惠价格
     * 2. 最低支付金额1元
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        BigDecimal discount = skuPrice.subtract(new BigDecimal(couponInfo));
        // compareTo : -1, 0, 1
        if(discount.compareTo(BigDecimal.ZERO) < 1) {
            return BigDecimal.ONE;
        }
        log.info("直减计算 : couponInfo : {} , skuPrice: {} , discount: {}", couponInfo, skuPrice, discount);
        return discount;
    }
}
