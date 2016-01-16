package com.bluewise.testJava;

import java.lang.annotation.*;
import java.util.HashMap;

/**
 * Created by wangshunchu on 15/12/28.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface testAna {
    public String name() default "wangsc";
}
