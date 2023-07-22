package AdvancedSyntax;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat("Toffi", 7);
        Dog myDog = new Dog();

        checkVeryImportant(myCat);
        checkVeryImportant((myDog));

    }
    public static void checkVeryImportant(Object obj) {
        if(obj.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println( obj.getClass().getName() + " This is very important");
        } else {
            System.out.println(  obj.getClass().getName() + "THis is not very important. ");
        }
    }

}


