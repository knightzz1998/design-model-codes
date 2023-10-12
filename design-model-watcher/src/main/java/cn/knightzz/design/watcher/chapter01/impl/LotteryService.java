package cn.knightzz.design.watcher.chapter01.impl;

import cn.knightzz.design.watcher.chapter01.LotteryResult;

/**
 * @author 王天赐
 * @title: LotteryService
 * @description:
 * @create: 2023-10-11 21:37
 */
public interface LotteryService {

    LotteryResult doDraw(int uid);
}
