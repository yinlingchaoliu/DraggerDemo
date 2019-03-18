package com.chaoliu.easy.demo;

import com.chaoliu.easy.annotation.EasyModule;
import com.chaoliu.easy.annotation.EasyProvides;

@EasyModule
public class DemoModule {

    @EasyProvides
    public static Demo getInstance(){
        return new Demo(  );
    }

    @EasyProvides
    public static TestSingleton getTestSingleton(){
        return TestSingleton.getInstance();
    }

}
