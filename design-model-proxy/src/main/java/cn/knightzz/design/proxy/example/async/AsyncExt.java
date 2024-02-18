package cn.knightzz.design.proxy.example.async;

import java.lang.annotation.*;

/**
 * @author 王天赐
 * @title AsyncExt
 * @description
 * @create 2024-02-17 20:32
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AsyncExt {

}
