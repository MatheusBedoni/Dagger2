package com.app.redes.injecaodedependencia;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;

import com.app.redes.injecaodedependencia.contract.MyApplicationComponent;

import com.app.redes.injecaodedependencia.module.ApplicationModule;

import dagger.internal.DaggerCollections;


/**
 * Created by Matt on 26/02/2019.
 */

public class AndroidApplication extends Application{
    private MyApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationComponent == DaggerMyApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public MyApplicationComponent getApplicationComponent(){
        return( mApplicationComponent );
    }


}
