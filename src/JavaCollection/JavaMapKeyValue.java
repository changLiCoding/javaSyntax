package JavaCollection;

import java.util.HashMap;

public class JavaMapKeyValue {
    public static void main(String[] args) {
//        Collection: HashMap - Hash Function + Map
        HashMap<String, String> map = new HashMap();
//        put method to add or update data. Data with same key but different value will be replaced.
        map.put("Cartman", "Eric");
        map.put("Marsh", "Stan");
        map.put("Broflovski", "Kyle");
        map.put("McCormick", "Kenny");
        System.out.println(map);

        map.put("Marsh", "Randy");
        System.out.println(map);

        map.put("Chang", "Li");
        System.out.println(map);

        System.out.println(map.get("Chang"));

        map.remove("Chang");
        System.out.println(map);

        System.out.println(map.get("Chang"));
    }
}
