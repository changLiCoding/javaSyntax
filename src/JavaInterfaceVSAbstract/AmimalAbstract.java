package JavaInterfaceVSAbstract;

public abstract class AmimalAbstract {
    String name;
    int age;



    public abstract void eat();

    public void printName() {
        System.out.println("This is " + name);
    }
}
