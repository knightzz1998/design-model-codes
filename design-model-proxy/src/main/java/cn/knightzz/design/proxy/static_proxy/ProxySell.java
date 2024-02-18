package cn.knightzz.design.proxy.static_proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 王天赐
 * @title ProxySellTickets
 * @description
 * @create 2024-02-16 10:26
 */
@Slf4j
public class ProxySell implements SellTickets{

    TrainStation trainStation = new TrainStation();

    @Override
    public void sell(int num) {
        log.info("proxy sell tickets {}" , num);
        trainStation.sell(num);
    }
}
