package JavaInterfaceVSAbstract;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat("Toffi", 7);
        myCat.eat();
        myCat.printName();
        System.out.println(myCat.name);
        myCat.poop();

        Dog myDog = new Dog();

        PrintString stringPrinter = new PrintString("Print this string");
        stringPrinter.print();
        PrintInteger integerPrinter = new PrintInteger(1231);
        integerPrinter.print();

        GenericPrinter<Long> genericPrinterLong = new GenericPrinter<>(21_231L);
        genericPrinterLong.print();

        GenericPrinter<Cat> genericPrinterCat = new GenericPrinter<>(myCat);
        genericPrinterCat.print();

        PrinterAnimal<Cat> animalPrinterCat = new PrinterAnimal<>(myCat);
        animalPrinterCat.print();

        PrinterAnimal<Dog> animalPrinterDog = new PrinterAnimal<Dog>(myDog);
        animalPrinterDog.print();

        shout(myCat);

        ArrayList<Cat> catList = new ArrayList<>();
        catList.add(myCat);
        catList.add(myCat);
        catList.add(myCat);
        catList.add(myCat);
        catList.add(myCat);
        printListOfAnything(catList);
    }

    public static <T> void shout(T thingToShout) {
        System.out.println(thingToShout + "!!!!!!!!");
    }

    public static void printListOfAnything(List<? extends AmimalAbstract> mylist) {
        System.out.println(mylist);
    }
}
