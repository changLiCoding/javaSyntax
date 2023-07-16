package JavaCollection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListInJavaBasic {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add("CHANG");
        list.add("LI");
        list.addFirst("FirstChang");
        list.addLast("LastChang");
        list.add(2, "CHangINDEX 2");
        System.out.println(list);
        list.set(0, "FIrst name get CHanged");

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.remove("LI");

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        ArrayList otherList = new ArrayList();
        otherList.add("from otherList 1");
        otherList.add("from otherList 2");
        otherList.add("from otherList 3");

        list.addAll(otherList);

        System.out.println(list);
        list.addAll(2, otherList);
        System.out.println(list);

        list.removeAll(otherList);
        System.out.println(list);

        list.remove(); // remove the first
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add(3, "CHANG");
        System.out.println(list);
        System.out.println(list.contains("LI"));
        System.out.println(list.element());
        System.out.println(list.indexOf(""));
        list.push(""); // add data in the first position
        System.out.println(list.indexOf(""));
        System.out.println(list);

        Object popData = list.pop();
        System.out.println(popData);
        System.out.println(list);
        System.out.println("END OF LINKEDLIST");
    }
}
