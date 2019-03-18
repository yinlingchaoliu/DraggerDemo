package com.chaoliu.easy.demo;

import com.chaoliu.easy.annotation.EasyProvides;

class TestSingleton {

    private static final TestSingleton ourInstance = new TestSingleton();

    private TestSingleton() {
    }

    @EasyProvides
    public static TestSingleton getInstance() {
        return ourInstance;
    }

    public void cutYourself(){
        System.out.println("超级自宫大法");
    }

}
