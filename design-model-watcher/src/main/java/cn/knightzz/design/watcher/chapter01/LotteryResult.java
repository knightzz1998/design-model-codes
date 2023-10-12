package cn.knightzz.design.watcher.chapter01;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;


/**
 * @author 王天赐
 * @title: LotteryResult
 * @description:
 * @create: 2023-10-11 21:37
 */
@Data
@AllArgsConstructor
public class LotteryResult {
    int uid;
    String lottery;
    Date date;
}
