package cn.knightzz.design.proxy.static_proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 王天赐
 * @title TrainStation
 * @description
 * @create 2024-02-16 10:28
 */
@Slf4j
public class TrainStation implements SellTickets {
    @Override
    public void sell(int num) {
        log.info("TrainStation sell tickets {}", num);
    }
}
