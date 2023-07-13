package ObjectInJava;

public class ObjectBasic {
    public static void main(String[] args) {
        Object obj = new User("Chang");

        String str = obj.toString();
        System.out.println(str);

        int i = obj.hashCode();
        System.out.println(i);

        obj.equals(new User("Li"));

        System.out.println(obj.getClass());
        Class<?> aClass = obj.getClass();

        System.out.println(aClass.getSimpleName());
        System.out.println(aClass.getPackageName());
    }
}

class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
}
class User extends Person {

    User(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "User["+ this.name +"]";
    }
}