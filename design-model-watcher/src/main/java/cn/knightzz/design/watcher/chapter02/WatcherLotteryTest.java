package cn.knightzz.design.watcher.chapter02;

import cn.knightzz.design.watcher.chapter02.entity.LotteryResult;
import cn.knightzz.design.watcher.chapter02.impl.LotteryServiceImpl;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author 王天赐
 * @title: WatcherLotteryTest
 * @description:
 * @create: 2023-10-11 21:52
 */
@Slf4j
public class WatcherLotteryTest {

    @Test
    public void test01() {

        LotteryService lotteryService = new LotteryServiceImpl();

        LotteryResult lotteryResult = lotteryService.doDraw("2765789109876");

        log.info("执行结果 : {}", JSONObject.toJSONString(lotteryResult));

    }
}
