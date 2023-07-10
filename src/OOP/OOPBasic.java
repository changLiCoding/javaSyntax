package OOP;

public class OOPBasic {
    public static void main(String[] args) {


        Animal piggy = new Animal("piggy", 4);

        piggy.sayHello();

    }
}

 class Animal {
    private String name;
    private int legsNum;

    public Animal(String name, int legsNum) {
        this.name = name;
        this.legsNum = legsNum;
    }
    public void sayHello() {
        System.out.print("Hello! My name is: " + this.name + " And I have " + legsNum + " legs. ");
    }
}