package JavaInterfaceVSAbstract;

public class GenericPrinter<T> {
    T thingToPrint;

    public GenericPrinter(T getThingToPrint) {
        this.thingToPrint = getThingToPrint;
    }

    public void print() {
        System.out.println("Generic Printer print: " + thingToPrint);
    }
}
