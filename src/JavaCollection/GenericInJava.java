package JavaCollection;

import java.util.ArrayList;

public class GenericInJava {
    public static void main(String[] args) {

        ArrayList<User2> list = new ArrayList();

        User2 user = new User2();
        user.testUser();
//        user.testPerson();
//        Person2 person2 = (Person2)user;
        Person2 person2 = new Person2();
        person2.testPerson();
//        person2.testUser(); Can use User2 method

        list.add(user);
//        list.add(person2);

        Object o = list.get(0);
//      object type data o equals to User2 type of data
        System.out.println(o.equals(user));

//        User2 || Person2 instanceFromObj

        User2 userFromObj = (User2)o;

        userFromObj.testUser();

    }
}

class User2  {
    public void testUser() {
        System.out.println("user....");
    }
}

class Person2 {
    public void testPerson() {
        System.out.println("person...");
    }
}