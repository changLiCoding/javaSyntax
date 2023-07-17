package JavaCollection;

import java.util.*;

public class HashMapMethods {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
//        whenever there is no duplication key in put, null will be returned
        System.out.println(map.put("Cartman", "Eric"));
        map.put("Marsh", "Stan");
        map.put("Broflovski", "Kyle");
        map.put("McCormick", "Kenny");
        System.out.println(map);
//        whenever there is key duplication in put method, old value will be returned.
        System.out.println(map.put("Marsh", "Randy"));
        System.out.println(map);
//        only add when key absent
        map.putIfAbsent("Marsh", "Shelly");
        System.out.println(map);

//         replace method only update key value when key existed.
        map.replace("Marsh", "Shelly");
        System.out.println(map);
        map.replace("Burch", "Timmy");
        System.out.println(map);

//        map.clear();

        Set set = map.keySet();
        System.out.println(set);

        for (Object key : set) {
            System.out.println("First name: " + map.get(key) + ". Last name: " + key);
        }

        System.out.println(map.containsKey("Marsh"));

        Collection<String> values = map.values();
        System.out.println(values);
        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println("First name and last name: " + value + " " + key);
        }
//          only remove when key value pair match
        map.remove("Marsh", "Randy");
        System.out.println(map);


    }
}
