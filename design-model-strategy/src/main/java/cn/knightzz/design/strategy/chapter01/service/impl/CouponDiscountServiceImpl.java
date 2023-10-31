package cn.knightzz.design.strategy.chapter01.service.impl;

import cn.knightzz.design.strategy.chapter01.service.CouponDiscountService;

/**
 * @author 王天赐
 * @title CouponDiscountServiceImpl
 * @description
 * @create 2023-10-31 18:06
 */
public class CouponDiscountServiceImpl implements CouponDiscountService {
    @Override
    public double discountAmount(int type, double typeContent, double skuPrice, double typeExt) {

        // 1. 直减券
        if (1 == type) {
            return skuPrice - typeContent;
        }
        // 2. 满减券
        if (2 == type) {
            if (skuPrice < typeExt) {
                return skuPrice;
            }
            return skuPrice - typeContent;
        }
        // 3. 折扣券
        if (3 == type) {
            return skuPrice * typeContent;
        }
        // 4. n元购
        if (4 == type) {
            return typeContent;
        }
        return 0D;
    }
}
