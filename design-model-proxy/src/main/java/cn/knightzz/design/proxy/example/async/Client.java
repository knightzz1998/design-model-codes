package cn.knightzz.design.proxy.example.async;

/**
 * @author 王天赐
 * @title Client
 * @description
 * @create 2024-02-17 20:48
 */
public class Client {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        OrderService orderService = proxyFactory.createOrderServiceProxy();
        orderService.createOrder();
        orderService.payOrder();
        orderService.cancelOrder();
    }
}
