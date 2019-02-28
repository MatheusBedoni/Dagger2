package com.app.redes.injecaodedependencia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.app.redes.injecaodedependencia.contract.CourseComponent;
import com.app.redes.injecaodedependencia.contract.MyApplicationComponent;
import com.app.redes.injecaodedependencia.domain.Course;
import com.app.redes.injecaodedependencia.module.CourseModule;

public class MainActivity extends AppCompatActivity {
    private static CourseComponent mCourseComponent;
    private Course mCourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CourseComponent = DaggerCourseComponent
                .builder()
                .applicationComponent( getApplicationComponent() )
                .carModule( new CourseModule())
                .build();

        //mCar = new Car();

        mCourse = mCourseComponent.provideCourse();
        mCourseComponent.inject(mCourse);

    }

    private MyApplicationComponent getApplicationComponent(){
        return( ((AndroidApplication) getApplication()).getApplicationComponent() );
    }
}
