package cn.knightzz.design.proxy.dynamic_proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 王天赐
 * @title Shop
 * @description
 * @create 2024-02-16 10:37
 */
@Slf4j
public class Shop implements SellFood{
    @Override
    public void sell(String food) {
        log.info("在商场里出售 food: {}",food);
    }

    @Override
    public void buy(String food) {
        log.info("在商场里购买 food: {}",food);
    }
}
