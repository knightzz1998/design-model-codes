package cn.knightzz.design.watcher.chapter02.entity;

import lombok.*;

import java.util.Date;


/**
 * @author 王天赐
 * @title: LotteryResult
 * @description:
 * @create: 2023-10-11 21:37
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LotteryResult {
    String uid;
    String lottery;
    Date date;
}
