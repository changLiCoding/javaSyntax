package JavaCollection;

import java.util.HashSet;

public class AddObjectInHashSet {
    public static void main(String[] args) {
        User4 user1 = new User4(1001, "Chang");
        User4 user2 = new User4(1002, "Cartman");
        User4 user3 = new User4(1003, "Stan");
        User4 user4 = new User4(1004, "Kyle");
        System.out.println(user4.hashCode());
        User4 user5 = new User4(1004, "Kyle");
        System.out.println(user5.hashCode());
        HashSet<User4> set = new HashSet<>();
        set.add(user1);
        set.add(user2);
        set.add(user3);
        set.add(user4);
        set.add(user5);
        System.out.println(set);
    }
}

class User4 {
    public int id;
    public String name;

    public User4(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User["+ id +", "+ name + "]";
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User4) {
            User4 userObj = (User4)obj;
            if(userObj.id == this.id) {
                if(userObj.name.equals(this.name)) {
                    return true;
                }
            }

        }
        return false;
    }
}