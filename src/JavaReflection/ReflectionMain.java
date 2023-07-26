package JavaReflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionMain {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat myCat = new Cat("Toffiee", 9);

        Field[] catFields = myCat.getClass().getDeclaredFields();

        for (Field catField : catFields) {
            System.out.println("Cat Class field name: " + catField.getName());
            if(catField.getName().equals("name")) {
                try {
                    catField.setAccessible(true);
                    catField.set(myCat, "Toffiee new name");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                    System.out.println(e.getMessage());
                } finally {
                    System.out.println("Cat's instance name: " + myCat.getName());
                    System.out.println("COMPLETED");
                }
            }
            System.out.println(catField);
        }

        Method[] catMethods = myCat.getClass().getDeclaredMethods();

        for (Method catMethod : catMethods) {
            System.out.println(catMethod.getName());
            if(catMethod.getName().equals("meow")) {
                catMethod.invoke(myCat);
            }

            if(catMethod.getName().equals("heyThisIsPrivate")) {
                catMethod.setAccessible(true);
                catMethod.invoke(myCat);
            }

            if(catMethod.getName().equals("thisIsAStaticPrivateMethod")) {
                catMethod.setAccessible(true);
                catMethod.invoke(null);
            }
        }

    }

}
