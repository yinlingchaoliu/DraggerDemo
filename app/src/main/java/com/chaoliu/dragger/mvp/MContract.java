package com.chaoliu.dragger.mvp;

public interface MContract {

    public interface BaseView extends IView{
        void showToast(String msg);
    }

    public abstract class BasePresent extends IPresent<BaseView>{
        public abstract String getData();
    }

}
