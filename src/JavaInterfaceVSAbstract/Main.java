package JavaInterfaceVSAbstract;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat("Toffi", 7);
        myCat.eat();
        myCat.printName();
        System.out.println(myCat.name);
        myCat.poop();

        PrintString stringPrinter = new PrintString("Print this string");
        stringPrinter.print();
        PrintInteger integerPrinter = new PrintInteger(1231);
        integerPrinter.print();

        GenericPrinter<Long> genericPrinterLong = new GenericPrinter<>(21_231L);
        genericPrinterLong.print();
    }
}
