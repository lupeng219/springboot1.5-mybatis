package com.example.util;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2019/3/1.
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Mylog {

    String value();
    String name();

}
