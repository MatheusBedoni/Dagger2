package com.app.redes.injecaodedependencia.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by Matt on 26/02/2019.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActiivity {
}
