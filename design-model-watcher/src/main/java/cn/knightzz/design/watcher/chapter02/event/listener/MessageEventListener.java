package cn.knightzz.design.watcher.chapter02.event.listener;

import cn.knightzz.design.watcher.chapter02.entity.LotteryResult;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 王天赐
 * @title: MessageEventListener
 * @description: MQ发送事件
 * @create: 2023-10-11 21:53
 */
@Slf4j
public class MessageEventListener implements EventListener {

    @Override
    public void doEvent(LotteryResult res) {
        log.info("记录⽤户 {} 摇号结果(MQ)：{}", res.getUid(), res.getLottery());
    }
}
