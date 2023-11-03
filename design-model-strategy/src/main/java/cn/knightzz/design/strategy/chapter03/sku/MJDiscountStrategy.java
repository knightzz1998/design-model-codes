package cn.knightzz.design.strategy.chapter03.sku;

import cn.knightzz.design.strategy.chapter03.constant.strategy.DiscountStrategyConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author 王天赐
 * @title MJDiscountStrategy
 * @description 满减策略
 * @create 2023-11-03 18:21
 */
@Component
@Slf4j
public class MJDiscountStrategy implements IDiscountStrategy<Map<String, String>> {
    @Override
    public BigDecimal discountAmount(Map<String, String> couponInfo, BigDecimal skuPrice) {
        // 1. 满 x - n 元
        String x = couponInfo.get("x");
        String n = couponInfo.get("n");

        log.info("满减计算 : couponInfo : {} , skuPrice: {}", couponInfo, skuPrice);

        // skuPrice - x < 0
        if (skuPrice.compareTo(new BigDecimal(x)) < 0) {
            return skuPrice;
        } else {
            return skuPrice.subtract(new BigDecimal(n));
        }
    }

    @Override
    public DiscountStrategyConstant type() {
        return DiscountStrategyConstant.FULL_DISCOUNT_STRATEGY;
    }
}
