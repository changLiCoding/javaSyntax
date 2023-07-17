package JavaCollection;

import java.util.ArrayList;
import java.util.HashSet;

public class SetInJava {
    public static void main(String[] args) {
//        HashSet: Hash + Set
//        Hash address with Hash algorithm: Hash conflict make sure HashSet without duplication
//        ArrayList: array
//        LinkedList: Linked List
        HashSet<String> set = new HashSet();

        set.add("Chang");
        set.add("LI");
        set.add("123");
        set.add("Chang");
        System.out.println(set);

        set.remove("123");
        System.out.println(set);

        set.add("12345");
        System.out.println(set);

        for (String s : set) {
            System.out.println(s);
        }

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("First List");
        arrayList.add("CHANG");
        arrayList.add("CHANG");
        arrayList.add("LI");

        set.addAll(arrayList);

        System.out.println(set);

        System.out.println(set.contains("LI"));
        Object clone = set.clone();
        System.out.println(clone);
        System.out.println(clone.getClass());
        ArrayList<String> list = (ArrayList<String>)clone;
        System.out.println(list);
        System.out.println(set);
    }
}
