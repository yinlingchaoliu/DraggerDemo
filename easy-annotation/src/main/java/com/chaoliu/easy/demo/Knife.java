package com.chaoliu.easy.demo;

import com.chaoliu.easy.annotation.EasyProvides;

public class Knife {

    @EasyProvides
    public Knife() {
        Log.e("TAG", "我是一个小刀123");
    }

    public void cut() {
        Log.e("TAG", "我可以切水果");
    }
}