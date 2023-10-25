package cn.knightzz.design.factory.chapter02.controller;

import cn.knightzz.design.factory.chapter02.dto.req.LotteryReqDTO;
import cn.knightzz.design.factory.chapter02.factory.ICommodity;
import cn.knightzz.design.factory.chapter02.factory.StoreFactory;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 王天赐
 * @title LotteryController
 * @description
 * @create 2023-10-25 11:53
 */
@RestController
public class LotteryController {

    @Resource
    private StoreFactory storeFactory;

    @RequestMapping("/lottery")
    public JSONObject lottery(@RequestBody LotteryReqDTO reqDTO) throws Exception {
        JSONObject result = new JSONObject();
        result.put("code", "200");
        result.put("msg", "success");
        ICommodity commodityService = storeFactory.getCommodityService(reqDTO.getCommodityType());
        commodityService.sendCommodity("1001", "01", "a01", null);
        return result;
    }
}
