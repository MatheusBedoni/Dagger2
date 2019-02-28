package com.app.redes.injecaodedependencia.contract;

import android.content.SharedPreferences;

import com.app.redes.injecaodedependencia.AndroidApplication;
import com.app.redes.injecaodedependencia.module.ApplicationModule;


import javax.inject.Singleton;

import dagger.Component;


/**
 * Created by Matt on 26/02/2019.
 */
@Singleton
@Component( modules = {
        ApplicationModule.class
})
public interface MyApplicationComponent  {
    SharedPreferences providePreferences();


}
