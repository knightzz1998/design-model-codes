package cn.knightzz.design.proxy.dynamic_proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 王天赐
 * @title SellFood
 * @description
 * @create 2024-02-16 10:36
 */
public interface SellFood {
    public void sell(String food);
    public void buy(String food);
}
