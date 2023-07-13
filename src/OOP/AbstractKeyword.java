package OOP;

public class AbstractKeyword {
    static public void main(String[] args) {
        Driver timmy = new Driver("Timmy", 56);
        timmy.eat();
        timmy.speak("Hello!");

        Me me = new Me();
        me.sayHello(timmy);
        me.sayHello(new Person1("Kenny") {
            @Override
            public int age() {
                return 25;
            }

            @Override
            public void eat() {

            }
        });
    }
}

abstract class Person1 {
    String name;
    public abstract int age();

     Person1(String name) {
        this.name = name;
    }
    public abstract void eat();

    void speak(String words) {
        System.out.println(name + " says: " + words);
    }

}

class Driver extends Person1 {
    public int age;
    public int age() {
        return this.age;
    };
     Driver(String name, int age) {
        super(name);
        this.age = age;
    }
    public void eat() {
        System.out.println("Me " + name + " I eat in my semi. I eat a lot in my age of " + this.age+ ".");
    }
}

class Me {
    public void sayHello (Person1 person1) {
        System.out.println("Hello " + person1.name+ ". I know you are " + person1.age() + " years old! ");
    }
}
