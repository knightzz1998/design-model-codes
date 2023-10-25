package cn.knightzz.design.factory.chapter02.dto.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author 王天赐
 * @title LotteryReqDTO
 * @description
 * @create 2023-10-25 15:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LotteryReqDTO {

    /**
     * 奖励类型
     */
    private Integer commodityType;
}
