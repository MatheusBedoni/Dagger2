package com.app.redes.injecaodedependencia.module;

import com.app.redes.injecaodedependencia.domain.Course;
import com.app.redes.injecaodedependencia.domain.Instructor;
import com.app.redes.injecaodedependencia.scope.PerActiivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Matt on 26/02/2019.
 */
@Module
public class CourseModule {
    @Provides
    @PerActiivity
    public Instructor provideEngine(){

        return new Instructor() ;
    }


    @Provides
    @PerActiivity
    public Course provideCar( ){

        return new Course( ) ;
    }
}
