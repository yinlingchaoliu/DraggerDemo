package com.chaoliu.easy.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * 对外支撑工具
 */
@Target({METHOD})
@Retention(CLASS)
@Documented
public @interface EasyModuleProvides {
    String name() default "";
}
