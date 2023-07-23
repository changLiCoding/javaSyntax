package AdvancedSyntax;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat myCat = new Cat("Toffi", 7);
        Dog myDog = new Dog();

        checkVeryImportant(myCat);
        checkVeryImportant((myDog));

        checkRunImmediately(myCat);

        checkImportantString(myCat);

    }
    public static void checkVeryImportant(Object obj) {
        if(obj.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println( obj.getClass().getName() + " This is very important");
        } else {
            System.out.println(  obj.getClass().getName() + "THis is not very important. ");
        }
    }

    public static void checkRunImmediately(Object obj) throws InvocationTargetException, IllegalAccessException {
        for (Method method: obj.getClass().getDeclaredMethods()) {
            if(method.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);

                for(int i = 0; i < annotation.times(); i++) {
                    method.invoke(obj);
                }
            }
        }
    }
    public static void checkImportantString(Object obj) throws InvocationTargetException, IllegalAccessException {
        for (Field field: obj.getClass().getDeclaredFields()) {
            if(field.isAnnotationPresent(ImportantString.class)) {
                System.out.println(field.get(obj).toString());
            }
        }
    }
}


