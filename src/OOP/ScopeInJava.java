package OOP;

public class ScopeInJava {
    public static void main(String[] args) {
        User2 user = new User2();

        user.test();
        System.out.println(user.name);
        System.out.println(user.getParentName());

    }
}
class Person2 {
    public String name = "Person2";
}
class User2 extends Person2 {
    public String name = "Attribute";
    public void test() {
        String name = "Method";
        System.out.println(name);
    }
    public String getParentName() {
        return super.name;
    }
}