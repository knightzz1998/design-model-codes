package cn.knightzz.design.watcher.chapter02.impl;

import cn.knightzz.design.watcher.chapter02.LotteryService;
import cn.knightzz.design.watcher.chapter02.entity.LotteryResult;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;


/**
 * @author 王天赐
 * @title: LotteryServiceImpl
 * @description:
 * @create: 2023-10-11 21:39
 */
@Slf4j
public class LotteryServiceImpl extends LotteryService {

    LotteryNumberService lotteryNumberService = new LotteryNumberService();

    @Override
    protected LotteryResult doDraw(String uid) {
        // 摇号
        String miniBusNumber = lotteryNumberService.getMiniBusNumber(uid);
        // 返回结果
        return new LotteryResult(uid, miniBusNumber, new Date());
    }
}
