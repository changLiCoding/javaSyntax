package JavaInterfaceVSAbstract;

public class PrintInteger {
    Integer thingToPrint;
    public PrintInteger(Integer thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println("Integer Printer print: " + thingToPrint);
    }

}
