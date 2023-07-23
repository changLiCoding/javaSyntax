package JavaInterfaceVSAbstract;

public class PrintString {
    String thingToPrint;
    public PrintString(String item) {
        this.thingToPrint = item;
    }
    public void print() {
        System.out.println(this.thingToPrint);
    }
}
