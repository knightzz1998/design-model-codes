package cn.knightzz.design.strategy.chapter03.sku;

import cn.knightzz.design.strategy.chapter03.constant.strategy.DiscountStrategyConstant;

import java.math.BigDecimal;

/**
 * @author 王天赐
 * @title IDiscountStrategy
 * @description
 * @create 2023-11-03 17:54
 */

public interface IDiscountStrategy<T> {

    /**
     * 计算折扣金额
     * @param couponInfo 折扣信息
     * @param skuPrice 初始金额
     * @return
     */
    BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice);

    /**
     * 策略标识
     * @return
     */
    DiscountStrategyConstant type();

}
