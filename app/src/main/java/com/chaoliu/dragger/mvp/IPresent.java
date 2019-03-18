package com.chaoliu.dragger.mvp;

import java.lang.ref.WeakReference;

public class IPresent<ROOTVIEW> {

    protected WeakReference<ROOTVIEW> mViewWeakRef = null;

    public void attchView(ROOTVIEW mView){
        mViewWeakRef = new WeakReference<>( mView );
    }

    public ROOTVIEW getView(){
        return mViewWeakRef.get();
    }

    public boolean isDetached(){
        return mViewWeakRef == null || mViewWeakRef.get()==null;
    }

    public void detachView(){
        if (mViewWeakRef!=null){
            mViewWeakRef.clear();
            mViewWeakRef = null;
        }
    }


}
