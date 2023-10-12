package cn.knightzz.design.watcher.chapter02.event.listener;

import cn.knightzz.design.watcher.chapter02.entity.LotteryResult;

/**
 * @author 王天赐
 * @title: EventListener
 * @description: 事件监听器
 * @create: 2023-10-11 21:53
 */
public interface EventListener {


    void doEvent(LotteryResult res);

}
