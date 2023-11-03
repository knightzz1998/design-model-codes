package cn.knightzz.design.strategy.chapter03.sku;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Map;

/**
 * @author 王天赐
 * @title DiscountContext
 * @description
 * @create 2023-11-03 18:32
 */
@Component
public class DiscountContext<T> implements InitializingBean {

    /**
     * Spring上下文
     */
    @Resource
    ApplicationContext applicationContext;

    @Resource
    private IDiscountStrategy<T> couponDiscount;

    public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice) {
        return couponDiscount.discountAmount(couponInfo, skuPrice);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Map<String, IDiscountStrategy> discountStrategyMap = applicationContext.getBeansOfType(IDiscountStrategy.class);
        discountStrategyMap.forEach((name, bean) -> {
            
        });

    }
}
