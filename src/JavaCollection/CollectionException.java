package JavaCollection;

import java.util.*;

public class CollectionException {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>(0);
//        System.out.println(Arrays.toString());
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add(null);
        list.add("e");
        list.add("f");

        System.out.println(list.get(5));
        System.out.println(list.get(0));
        System.out.println(list.get(4));

//        LinkedList linkedList = new LinkedList<>();
//        System.out.println(linkedList.getFirst());

        HashMap map = new HashMap<>();

        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");

        Iterator<String> iter = map.keySet().iterator();

        while(iter.hasNext()) {
            String s = iter.next();
            if("b".equals(s)) {
                iter.remove();
            }
            System.out.print(map.get(s) + "  ");
            System.out.println(s);
        }
    }
}
