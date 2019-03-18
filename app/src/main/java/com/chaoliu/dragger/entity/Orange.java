package com.chaoliu.dragger.entity;

import android.util.Log;

public class Orange {
    Knife knife;

    public Orange(Knife knife) {
        this.knife = knife;
        Log.e( "TAG", "我是一个桔子" );
    }

    public void cutYourself() {
        knife.cut();
        Log.e( "TAG", "我要自切" );
    }
}