package com.example.stan.carcatalogue7;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class AndroidApplication extends DaggerApplication {
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return null;
        //return DaggerAppComponent.builder().application(this).build();


    }
}