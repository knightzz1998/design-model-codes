package cn.knightzz.design.factory.chapter01.service;

import cn.knightzz.design.factory.chapter01.dto.AwardReq;
import cn.knightzz.design.factory.chapter01.dto.CouponResult;

/**
 * @author 王天赐
 * @title CouponService
 * @description
 * @create 2023-10-14 10:07
 */
public class CouponService {

    public CouponResult sendCoupon(AwardReq req) {
        return new CouponResult("0000", "发放成功");
    }
}
