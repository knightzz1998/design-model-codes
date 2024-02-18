package cn.knightzz.design.proxy.static_proxy;

/**
 * @author 王天赐
 * @title Client
 * @description
 * @create 2024-02-16 10:27
 */
public class Client {
    public static void main(String[] args) {
        ProxySell proxySellTickets = new ProxySell();
        proxySellTickets.sell(10);
    }
}
