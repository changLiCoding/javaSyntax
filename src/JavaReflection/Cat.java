package JavaReflection;

public class Cat {
    private final String name;
    private int age;


    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void meow() {
        System.out.println("Meow");
    }

    private void heyThisIsPrivate() {
        System.out.println("How idi you call the private methods!!??");
    }

    public static void thisIsAPublicStaticMethod() {
        System.out.println("This is a public and static method!!!");
    }

    private static void thisIsAStaticPrivateMethod() {
        System.out.printf("You can not call a private and static method!!!");
    }
}
