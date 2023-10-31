package cn.knightzz.design.strategy.chapter02;

import java.math.BigDecimal;

/**
 * @author 王天赐
 * @title ICouponDiscount
 * @description
 * @create 2023-10-31 22:00
 */
public interface ICouponDiscount<T> {

    /**
     * 优惠卷金额计算
     * @param couponInfo 券折扣信息；直减、满减、折扣、N元购
     * @param skuPrice sku金额
     * @return 优惠后的金额计算
     */
    BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice) ;
}
