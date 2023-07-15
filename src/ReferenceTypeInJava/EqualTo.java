package ReferenceTypeInJava;

public class EqualTo {
    public static void main(String[] args) {
        int i = 10;
        double d = 10.000000;
        System.out.println(i == d);

        String a = "abc";
        String b = "abc";
        String e = new String("abc");
        System.out.println(a == b);
        System.out.println(a == e);
        System.out.println(a.equals(e));
        Integer c = i;
        System.out.println(c == i);

        User2 user = new User2();
        User2 user1 = new User2();
        System.out.println(user == user1);
        System.out.println(user.equals(user1));

        Integer f = 10;
        System.out.println(f ==  c);
    }
}

class User2 {
    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}