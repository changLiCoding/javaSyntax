package JavaCollection;

import java.util.ArrayList;

public class ArrayListInJavaList {
    public static void main(String[] args) {
//        ArrayList: Array + List
        ArrayList list = new ArrayList();
        list.add("Chang");
        list.add("Li");
        list.add("Ch");
        list.add("Cha");
        list.add("Chan");
        list.add("Chang");
        list.add("L");
        list.add("Li");
        list.add("LiC");
        list.add("LiCh");
        list.add("LiCha");
        list.add(23123);
        list.set(1, 234);
        System.out.println(list.get(list.size() - 1).getClass());
        System.out.println(list.get(0).equals(list.get(5)));

        for (Object name : list) {
            System.out.println(name);
        }
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(3));

        Object valDeleted = list.remove(list.size() - 1);
        System.out.println("Value removed: " + valDeleted);
        System.out.println(list);
        System.out.println("End of Main");
    }
}
