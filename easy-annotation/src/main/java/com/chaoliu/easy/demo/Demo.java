package com.chaoliu.easy.demo;

import com.chaoliu.easy.annotation.EasyProvides;

public class Demo {

    String name;

    @EasyProvides(name = "xxx")
    public Demo(){
    }

    @EasyProvides(name = "name")
    public Demo(String name){

    }

    @EasyProvides(name = "static")
    public static Demo getInstance(){
        return new Demo(  );
    }

}