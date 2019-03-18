package com.chaoliu.dragger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.chaoliu.dragger.demo.MainPresent;
import com.chaoliu.dragger.entity.DaggerMainComponent;
import com.chaoliu.dragger.entity.Fruit;
import com.chaoliu.dragger.entity.Knife;
import com.chaoliu.dragger.entity.MVPModule;
import com.chaoliu.dragger.entity.Orange;
import com.chaoliu.dragger.entity.SaladModule;
import com.chaoliu.dragger.entity.ShowInfoEntity;
import com.chaoliu.dragger.mvp.IPresent;
import com.chaoliu.dragger.mvp.MContract;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MContract.BaseView {

    @Inject
    Orange orange;

    @Inject
    Knife knife;

    @Inject
    Fruit fruit;

    @Inject
    ShowInfoEntity info;

    @Inject
    MainPresent mPresent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        DaggerMainComponent.builder()
                .saladModule( new SaladModule() )
                .mVPModule( new MVPModule( this) )
                .build().inject( this );
        orange.cutYourself();
        fruit.cutFruit();

        Log.e("TAG11",info.toString());

        mPresent.attchView( this );

        Log.e("TAG11",mPresent.getData());

//        mPresent.attchView( this );
//        mPresent = new MainPresent(this);
    }

    @Override
    public void showToast(String msg) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }
}