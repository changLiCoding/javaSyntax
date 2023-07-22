package AdvancedSyntax;

@VeryImportant
public class Cat {
    String name;
    int age;
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void meow() {
        System.out.println("Meow Meow");
    };

    public void eat() {
        System.out.println("Meow good fish!");
    }
}
