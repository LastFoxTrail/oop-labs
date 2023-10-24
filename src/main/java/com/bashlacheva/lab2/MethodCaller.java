package com.bashlacheva.lab2;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MethodCaller {

    public static <T> void callAnnotated(T obj) {
        Class<?> cls = obj.getClass();

        for (final Method method : cls.getDeclaredMethods()) {
            int mod = method.getModifiers();
            Annotation a = method.getDeclaredAnnotation(Annotation.class);
            
            if ((Modifier.isPrivate(mod) || Modifier.isProtected(mod)) && a != null) {
                for (int i = 0; i < a.count(); ++i) {
                    try {
                        method.setAccessible(true);
                        method.invoke(obj);
                        
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
    }
}
