package com.bashlacheva.lab2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Annotation {
	int DEFAULT_VALUE = 1;
    int count() default DEFAULT_VALUE;
}
