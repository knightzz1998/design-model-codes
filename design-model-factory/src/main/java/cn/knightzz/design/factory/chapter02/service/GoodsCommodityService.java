package cn.knightzz.design.factory.chapter02.service;

import cn.knightzz.design.factory.chapter02.factory.ICommodity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author 王天赐
 * @title GoodsCommodityService
 * @description 实物奖品
 * @create 2023-10-25 11:06
 */
@Slf4j
public class GoodsCommodityService implements ICommodity {
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        log.info("发送实物奖品 ... ");
    }
}
