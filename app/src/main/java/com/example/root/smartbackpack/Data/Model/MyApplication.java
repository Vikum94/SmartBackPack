package com.example.root.smartbackpack.Data.Model;

import android.app.Application;
import android.support.multidex.MultiDex;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);
    }
}

