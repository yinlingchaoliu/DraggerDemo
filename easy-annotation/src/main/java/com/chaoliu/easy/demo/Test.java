package com.chaoliu.easy.demo;

import com.chaoliu.easy.annotation.EasyInject;
import com.chaoliu.easy.annotation.EasyRelateInject;

public class Test {

    @EasyInject(name = "xxx")
    Demo demoxxx;

    @EasyInject(name="name")
    Demo demoName;

    @EasyInject(name="static")
    Demo nameTest;

    @EasyInject
    TestSingleton singleton;

    @EasyRelateInject
    Knife knife;

    @EasyRelateInject
    Orange orange;

    @EasyRelateInject
    Fruit fruit;


    void test(){
        EasyInjectTestComponent.builder().build().inject( Test.this );
    }

}