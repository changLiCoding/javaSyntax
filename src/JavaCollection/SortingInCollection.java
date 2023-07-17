package JavaCollection;

import java.util.ArrayList;
import java.util.Comparator;

public class SortingInCollection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1284);
        list.add(23);
        list.add(222345);
        System.out.println(list );

        list.sort(new NumberComparator());

        System.out.println(list);
        String s = "String";
        System.out.println(s instanceof Object);
        System.out.println(s instanceof String);
    }

}

class NumberComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return (o1 - o2);
    }
}