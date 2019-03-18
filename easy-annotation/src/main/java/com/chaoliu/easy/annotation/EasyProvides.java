package com.chaoliu.easy.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.CLASS;

@Documented
@Target({METHOD,CONSTRUCTOR}) @Retention(CLASS)
public @interface EasyProvides {
    String name() default "";
}
