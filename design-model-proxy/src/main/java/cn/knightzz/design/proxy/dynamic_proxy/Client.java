package cn.knightzz.design.proxy.dynamic_proxy;

/**
 * @author 王天赐
 * @title Client
 * @description
 * @create 2024-02-16 10:38
 */
public class Client {

    public static void main(String[] args) {

        ProxyFactory proxyFactory = new ProxyFactory();
        SellFood sellFood = proxyFactory.getProxyObject();
        sellFood.sell("100元");
        sellFood.buy("100元");
    }
}
