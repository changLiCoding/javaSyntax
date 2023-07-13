package OOP;

public class AbstractKeyword {
    static public void main(String[] args) {
        Driver timmy = new Driver("Timmy");
        timmy.eat();
        timmy.speak("Hello!");
    }
}

abstract class Person1 {
    String name;

     Person1(String name) {
        this.name = name;
    }
    public abstract void eat();

    void speak(String words) {
        System.out.println(name + " says: " + words);
    }

}

class Driver extends Person1 {
     Driver(String name) {
        super(name);
    }
    public void eat() {
        System.out.println("Me " + name + " I eat in my semi. ");
    }
}
