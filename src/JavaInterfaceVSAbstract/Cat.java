package JavaInterfaceVSAbstract;


public class Cat extends AmimalAbstract implements AnimalLikedBehavior{

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println(this.getClass().getName() + " Like to Eat Fish! ");
    }

    @Override
    public void poop() {
        System.out.println("Phlhlhljlhohohljhphouhlhouoljljohojlh");
    }
}
