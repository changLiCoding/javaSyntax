package AdvancedSyntax;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat myCat = new Cat("Toffi", 7);
        Dog myDog = new Dog();

        checkVeryImportant(myCat);
        checkVeryImportant((myDog));

        checkRunImmediately(myCat);

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

}


