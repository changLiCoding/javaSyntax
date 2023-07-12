package OOP;

public class OOPSuperThis {
    public static void main(String[] args) {
    Child child1 = new Child();
    child1.printName();
    child1.printNameFather();
    System.out.println(child1.sum());

    Parent child2 = new Child();
    System.out.println(child2.sum());


    }
}

class Parent {
    String name = "Father";
    int age = 58;
    int sum() {return age + 20;}
    public Parent() {

    }
    public void printName() {
        System.out.println("Print from Father Object. ");
    }
}

class Child extends Parent {
    String name = "Child";
    int age = 25;
    public void printName() {
        System.out.println(this.name);
        System.out.println(super.name);
    }

    public void printNameFather() {
        super.printName();
    }
    public int sum() {return super.age + 100;}
}