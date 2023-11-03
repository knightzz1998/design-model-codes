package cn.knightzz.design.strategy.chapter03.sku;

import cn.knightzz.design.strategy.chapter02.ICouponDiscount;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author 王天赐
 * @title ZKCouponDiscount
 * @description 折扣策略
 * @create 2023-10-31 22:03
 */
@Slf4j
@Component
public class ZKDiscountStrategy implements ICouponDiscount<Double> {

    /**
     * 折扣计算
     * 1. 使用商品价格乘以折扣比例，为最后支付金额
     * 2. 保留两位小数
     * 3. 最低支付金额1元
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {

        /* 四舍五入, 保留两位小数 */
        BigDecimal discount = skuPrice.multiply(new BigDecimal(couponInfo)).setScale(2, BigDecimal.ROUND_HALF_UP);

        if (discount.compareTo(BigDecimal.ZERO) < 1) {
            return BigDecimal.ONE;
        }
        return discount;
    }
}
