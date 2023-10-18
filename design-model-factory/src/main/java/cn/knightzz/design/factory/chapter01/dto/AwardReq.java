package cn.knightzz.design.factory.chapter01.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author 王天赐
 * @title AwardReq
 * @description
 * @create 2023-10-14 09:53
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AwardReq {
    public String uid;
    public int awareType;
}
