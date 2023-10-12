package cn.knightzz.design.watcher.chapter02.event.listener;

import cn.knightzz.design.watcher.chapter02.entity.LotteryResult;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 王天赐
 * @title: MQEventListener
 * @description:
 * @create: 2023-10-11 21:54
 */
@Slf4j
public class MQEventListener implements EventListener{
    @Override
    public void doEvent(LotteryResult res) {
        log.info("发送短信通知⽤户 {} 摇号结果(MQ)：{}", res.getUid(), res.getLottery());
    }
}
