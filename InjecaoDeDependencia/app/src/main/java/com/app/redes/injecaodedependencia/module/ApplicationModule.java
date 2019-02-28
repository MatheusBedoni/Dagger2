package com.app.redes.injecaodedependencia.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.app.redes.injecaodedependencia.MainActivity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Matt on 26/02/2019.
 */
@Module
public class ApplicationModule {
    private static final String PREF_KEY = "pk";

    private Application app;

    public ApplicationModule( Application a ){
        this.app = a;
    }


    @Provides
    @Singleton
    public SharedPreferences providePreferences( ){
        return( this.app.getSharedPreferences(PREF_KEY, Context.MODE_PRIVATE) );
    }
}
