package OOP;

public class StaticOOP {
    public static void main(String[] args) {
        Test.className = "test class";
        Test test1 = new Test();
        test1.name = "test1";
        test1.test();
        Test.className = "className Changed";
        test1.test();
        test1.testStatic();
        Test.testStatic();
        System.out.println(test1.className);
    }
}
class Test {
    String name;
    static String className;
    void test() {
        System.out.println("Instance method called");
        System.out.println(this.name);
        System.out.println(className);
    }
    static void testStatic() {
        System.out.println(className);
        System.out.println("called static method");
        System.out.println("called by ");
    }
}
