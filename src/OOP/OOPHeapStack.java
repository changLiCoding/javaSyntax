package OOP;

public class OOPHeapStack {
    public static void main(String[] args) {
        int a = 10;
        test(a);
        System.out.println(a);

        String b = "test";
        testString(b);
        System.out.println(b);

        Person student = new Person();
        student.name = "Kyle";
        System.out.println(student.name);
        testPerson(student);
        System.out.println(student.name);
        System.out.println(student.legs);
        student.legs = 3;
        System.out.println(student.legs);

        Person teacher = new Person();
        System.out.println(teacher.legs);
        System.out.println(teacher.name);
    }

    public static void test(int v) {
        v = v + 10;
    }
    public static void testString(String v) {
        v = v + 10;
    }
    public static void testPerson(Person person) {
        person.name = "Cartman";
    }

}
class Person {
    public String name;
    public int legs = 2;
}
