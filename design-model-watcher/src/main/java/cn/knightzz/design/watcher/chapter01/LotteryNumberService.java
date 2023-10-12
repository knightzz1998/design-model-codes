package cn.knightzz.design.watcher.chapter01;

import cn.hutool.core.util.RandomUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Random;

/**
 * @author 王天赐
 * @title: LotteryNumberService
 * @description:
 * @create: 2023-10-11 21:22
 */
@Slf4j
public class LotteryNumberService {

    public String getMiniBusNumber(int uid) {

        if (uid % 2 == 0) {
            log.info("很遗憾, 您未摇号成功");
            return "";
        }
        return "豫" + RandomUtil.randomEle(Arrays.asList("A", "B", "C")) + RandomUtil.randomNumbers(6);
    }
}
