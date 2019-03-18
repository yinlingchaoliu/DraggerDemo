package com.chaoliu.dragger.entity;

import com.chaoliu.dragger.demo.MainPresent;
import com.chaoliu.dragger.mvp.IView;
import com.chaoliu.dragger.mvp.MContract;

import dagger.Module;
import dagger.Provides;

@Module
public class MVPModule {

    private IView mView;

    public MVPModule(IView mView){
        this.mView = mView;
    }

    @Provides
    public IView getIView() {
        return mView;
    }

    @Provides
    public MainPresent getPresent(IView mView) {
        return new MainPresent( (MContract.BaseView) mView );
    }
}
