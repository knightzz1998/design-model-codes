package cn.knightzz.design.factory.chapter01.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author 王天赐
 * @title DeliverReq
 * @description
 * @create 2023-10-14 10:32
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DeliverReq {

    // 用户名..手机号,地址, 订单号 等字段
    public String consigneeUsername;
    public String consigneePhone;
    public String consigneeAddress;

}
