package cn.knightzz.design.factory.chapter01.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author 王天赐
 * @title: AwardRes
 * @description: 奖品响应结果
 * @create: 2023-10-14 09:53
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AwardRes {
    public String awareId;
    public String message;
}
