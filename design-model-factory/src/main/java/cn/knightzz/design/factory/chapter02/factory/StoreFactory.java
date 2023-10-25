package cn.knightzz.design.factory.chapter02.factory;

import cn.knightzz.design.factory.chapter02.service.CardCommodityService;
import cn.knightzz.design.factory.chapter02.service.CouponCommodityService;
import cn.knightzz.design.factory.chapter02.service.GoodsCommodityService;
import org.springframework.stereotype.Component;

/**
 * @author 王天赐
 * @title StoreFactory
 * @description
 * @create 2023-10-25 10:56
 */
@Component
public class StoreFactory {

    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) {
            return null;
        }
        if (1 == commodityType) {
            return new CouponCommodityService();
        }
        if (2 == commodityType) {
            return new GoodsCommodityService();
        }
        if (3 == commodityType) {
            return new CardCommodityService();
        }
        throw new RuntimeException("不存在的商品服务类型");
    }
}
