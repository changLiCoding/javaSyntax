package JavaInterfaceVSAbstract;

public class PrinterAnimal<T extends AmimalAbstract> {
    T animalInstance;
    public  PrinterAnimal(T animalInstance) {
        this.animalInstance = animalInstance;
    }

    public void print() {
        this.animalInstance.eat();
        System.out.println("Animal Printer print: " + this.animalInstance.getClass().getName());
    }
}
