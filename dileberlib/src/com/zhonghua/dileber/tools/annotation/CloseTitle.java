package com.zhonghua.dileber.tools.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by shidawei on 16/1/17.
 */
@Target(ElementType.TYPE)//表示用在类上
@Retention(RetentionPolicy.RUNTIME)//表示在生命周期是运行时
public @interface CloseTitle {

    boolean value() default true;

}
