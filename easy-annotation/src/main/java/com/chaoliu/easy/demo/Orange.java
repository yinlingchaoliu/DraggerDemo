package com.chaoliu.easy.demo;

import com.chaoliu.easy.annotation.EasyProvides;

public class Orange {

    Knife knife;

    @EasyProvides
    public Orange(Knife knife) {
        this.knife = knife;
        Log.e( "TAG", "我是一个桔子" );
    }

    public void cutYourself() {
        knife.cut();
        Log.e( "TAG", "我要自切" );
    }
}