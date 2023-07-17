package JavaCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class JavaIterator {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);

        Set<String> keys = map.keySet();
        Iterator<String> iterator = keys.iterator();

//        while(iterator.hasNext()) {
//            String s = iterator.next();
//            if("b".equals(s)) {
//                iterator.remove();
//            }
//            System.out.print(map.get(s) + "  ");
//            System.out.println(s);
//        }
        for (Iterator<String> it = iterator; it.hasNext(); ) {
            String key = it.next();
            if("b".equals(key)) {
                it.remove();
//                continue;
            }
            System.out.println("run");
            System.out.print(map.get(key) + "  ");
            System.out.println(key);
        }
    }
}
