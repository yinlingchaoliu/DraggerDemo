package com.chaoliu.dragger.entity;
import com.chaoliu.dragger.MainActivity;
import dagger.Component;

@Component(modules = {SaladModule.class, MVPModule.class})//指明要在那些Module里寻找依赖
public interface MainComponent {
    //因为我们要做沙拉
    void inject(MainActivity salad);
}