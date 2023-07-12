package OOP;

public class MethodOverride {
    static public void main(String[] args) {
        AAA aaa = new AAA();
        BBB bbb = new BBB();
        test(aaa);
        test(bbb);
//        Polymorphism
        AAA ccc = new BBB();
        test(ccc);
    }

    static public void test(AAA aaa) {
        System.out.println("aaa");
    }
    static public void test(BBB bbb) {
        System.out.println("bbb");
    }
}



class AAA {

}
class BBB extends AAA {

}
