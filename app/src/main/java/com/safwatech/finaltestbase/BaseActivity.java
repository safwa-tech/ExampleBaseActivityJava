package com.safwatech.finaltestbase;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;

import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;

public abstract class BaseActivity <VB extends ViewBinding> extends ComponentActivity {


    abstract String Log_Tag();
    abstract ViewBinding initViewBinding(LayoutInflater inflater);
    abstract void Setup();



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewBinding vb = (VB) initViewBinding(getLayoutInflater());
        setContentView(vb.getRoot());
        Setup();

    }
     void Print_Log(String valuePrint){
         Log.e(Log_Tag(),valuePrint);
     }
}
