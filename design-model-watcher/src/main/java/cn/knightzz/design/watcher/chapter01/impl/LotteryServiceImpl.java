package cn.knightzz.design.watcher.chapter01.impl;

import cn.knightzz.design.watcher.chapter01.LotteryNumberService;
import cn.knightzz.design.watcher.chapter01.LotteryResult;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;


/**
 * @author 王天赐
 * @title: LotteryServiceImpl
 * @description:
 * @create: 2023-10-11 21:39
 */
@Slf4j
public class LotteryServiceImpl implements LotteryService {

    LotteryNumberService lotteryNumberService = new LotteryNumberService();

    @Override
    public LotteryResult doDraw(int uid) {

        // 1. 摇号
        String lottery = lotteryNumberService.getMiniBusNumber(uid);

        String res = lottery.length() > 0 ? "摇号成功, 号码 : " + lottery : "摇号失败";

        // 2. 发短信给用户
        log.info("给用户 : {} 发送短信, 通知摇号结果 : {} ", uid, res);

        // 3. MQ 记录用户摇号结果
        log.info("记录用户 : {} 摇号结果 : {}", uid, res);

        return new LotteryResult(uid, res, new Date());
    }
}
