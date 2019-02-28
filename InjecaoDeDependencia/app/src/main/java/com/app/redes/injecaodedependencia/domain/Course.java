package com.app.redes.injecaodedependencia.domain;

import javax.inject.Inject;

/**
 * Created by Matt on 26/02/2019.
 */

public class Course {

    @Inject Instructor instructor;

    @Inject
    public Course(){

    }

}
