package cn.knightzz.design.watcher.chapter01;

import cn.hutool.core.util.RandomUtil;
import cn.knightzz.design.watcher.chapter01.impl.LotteryService;
import cn.knightzz.design.watcher.chapter01.impl.LotteryServiceImpl;
import org.junit.Test;

/**
 * @author 王天赐
 * @title: LotteryTest
 * @description:
 * @create: 2023-10-11 21:30
 */
public class LotteryTest {


   @Test
   public void test01() {

       LotteryNumberService lotteryNumberService = new LotteryNumberService();
       String miniBusNumber = lotteryNumberService.getMiniBusNumber(1000);
       System.out.println("miniBusNumber = " + miniBusNumber);
   }

    @Test
    public void test02() {

        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult lotteryResult = lotteryService.doDraw(1001);

        System.out.println(lotteryResult);

    }

}
