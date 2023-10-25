package cn.knightzz.design.factory.chapter02.factory;

import java.util.Map;

/**
 * @author 王天赐
 * @title ICommodity
 * @description 定义抽奖方法接口
 * @create 2023-10-24 10:49
 */
public interface ICommodity {

    /**
     * 发送奖品
     * @param uId 用户id
     * @param commodityId 奖品ID
     * @param bizId 业务ID
     * @param extMap 扩展字段数据
     * @throws Exception
     */
    void sendCommodity(String uId, String commodityId, String bizId,
                       Map<String, String> extMap) throws Exception;
}
