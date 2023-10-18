package cn.knightzz.design.factory.chapter01;

import cn.knightzz.design.factory.chapter01.dto.AwardReq;
import cn.knightzz.design.factory.chapter01.dto.AwardRes;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 王天赐
 * @title: PrizeController
 * @description:
 * @create: 2023-10-14 09:56
 */
@Slf4j
public class PrizeController {

    public AwardRes awardToUser(AwardReq req) {

        String reqJson = JSONObject.toJSONString(req);
        log.info("奖品发放开始 : {} , req : {}", req.getUid(), reqJson);
        AwardRes res = null;
        // 编写发放奖品逻辑
        if (req.awareType == 1) {
            // 根据不同类型发放不同的奖品 : 1 : 优惠卷, 2 实物商品, 3 第三方兑换卡
            // 1. 优惠卷需要传入 用户 uid, 奖品号码, bizId
            log.info("发放优惠卷");
        } else if (req.awareType == 2) {
            // 2. 实物商品需要传入用户填的地址, 姓名, 手机号等信息
            log.info("发放实物奖品");
        } else if (req.awareType == 3) {
            // 3. 发放爱奇艺奖品卡
            log.info("发放爱奇艺奖品卡");
        }
        return new AwardRes("1001", "发送成功");
    }

}
