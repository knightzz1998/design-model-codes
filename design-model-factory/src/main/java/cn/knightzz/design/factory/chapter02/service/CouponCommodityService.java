package cn.knightzz.design.factory.chapter02.service;

import cn.knightzz.design.factory.chapter02.factory.ICommodity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author 王天赐
 * @title CouponCommodityService
 * @description 优惠卷
 * @create 2023-10-25 11:04
 */
@Slf4j
public class CouponCommodityService implements ICommodity {
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        log.info("发送优惠卷 .. ");
    }
}
