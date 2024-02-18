package cn.knightzz.design.proxy.example.async;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 王天赐
 * @title OrderServiceImpl
 * @description
 * @create 2024-02-17 20:34
 */
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Override
    public void createOrder() {
        log.info("OrderServiceImpl create order");
    }

    @Override
    @AsyncExt
    public void payOrder() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("OrderServiceImpl pay order");
    }

    @Override
    public void cancelOrder() {
        log.info("OrderServiceImpl cancel order");
    }
}
