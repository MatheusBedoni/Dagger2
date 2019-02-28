package com.app.redes.injecaodedependencia.contract;

import android.content.SharedPreferences;

import com.app.redes.injecaodedependencia.domain.Course;
import com.app.redes.injecaodedependencia.module.CourseModule;
import com.app.redes.injecaodedependencia.scope.PerActiivity;

import dagger.Component;

/**
 * Created by Matt on 26/02/2019.
 */
@PerActiivity
@Component(
        dependencies = {
                MyApplicationComponent.class
        },
        modules = {
                CourseModule.class
        }
)
public interface CourseComponent {
        public void inject( Course car );

        Course provideCourse();

        SharedPreferences providePreferences();
}
