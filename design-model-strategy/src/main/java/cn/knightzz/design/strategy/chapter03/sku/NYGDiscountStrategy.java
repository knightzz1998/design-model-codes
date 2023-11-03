package cn.knightzz.design.strategy.chapter03.sku;

import cn.knightzz.design.strategy.chapter02.ICouponDiscount;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author 王天赐
 * @title NYGCouponDiscount
 * @description N元购折扣策略
 * @create 2023-10-31 22:01
 */
@Slf4j
public class NYGDiscountStrategy implements IDiscountStrategy<Double> {

    /**
     * 无论原价多少 都是按照 N 元
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        log.info("N元购 : couponInfo : {} , skuPrice: {}", couponInfo, skuPrice);
        return new BigDecimal(couponInfo);
    }
}
