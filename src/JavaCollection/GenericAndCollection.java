package JavaCollection;

public class GenericAndCollection {
    public static void main(String[] args) {
        MyContainer<User3> myContainer = new MyContainer();

//        myContainer.data = new User2();
        myContainer.data = new User3();

//        test(myContainer);
        MyContainer<Object> myObjContainer = new MyContainer<>();
        test(myObjContainer);


    }

    public static void test(MyContainer<Object> myContainer) {
        System.out.println(myContainer);
    }
}
class MyContainer<C> {
    public C data;
}

class User3 {

}