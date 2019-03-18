package com.chaoliu.dragger.demo;

import com.chaoliu.dragger.mvp.MContract;

public class MainPresent extends MContract.BasePresent {


    public MainPresent(MContract.BaseView baseView){
        attchView( baseView );
    }

    @Override
    public String getData() {
        if (isDetached()) return null;
        getView().showToast( "hahah" );
        getView().showLoading();
        getView().hideLoading();
        return "show your desire";
    }

}
