package cn.knightzz.design.factory.chapter01.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author 王天赐
 * @title CouponService
 * @description
 * @create 2023-10-14 10:18
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CouponResult {
    public String code;
    public String msg;
}
