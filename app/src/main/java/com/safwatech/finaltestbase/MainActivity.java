package com.safwatech.finaltestbase;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.LayoutInflater;
import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.viewbinding.ViewBinding;

import com.safwatech.finaltestbase.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends BaseActivity<ActivityMainBinding> {

    String TAG="MainActivity";


    @Override
    String Log_Tag() {
        return TAG;
    }

    @Override
    ViewBinding initViewBinding(LayoutInflater inflater) {

        ActivityMainBinding mainBinding = ActivityMainBinding.inflate(inflater);

        return mainBinding;
    }

    @Override
    void Setup() {

        Print_Log( "200000");
    }

}