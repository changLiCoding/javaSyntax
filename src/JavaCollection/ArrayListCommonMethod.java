package JavaCollection;

import java.util.ArrayList;

public class ArrayListCommonMethod {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<String>();

        list.add("chang");
        list.add("CHANG");
        list.add("CHang");
        list.add("LI");
        list.add("CHangLI");
        list.add(1231234);
        list.add("LI");
//        ArrayList insertion instead of replacement;
        list.add(2, "Hello");
        System.out.println(list);
//        ArrayList replacement instead of insertion:
        Object replacedVal = list.set(2, "hello world");
        System.out.println(list);
        System.out.println("Replaced value: " + replacedVal);

        ArrayList otherList = new ArrayList();
        otherList.add(1);
        otherList.add(2);
        otherList.add(3);
        list.addAll(otherList);
        System.out.println(list);
        list.addAll(2, otherList);
        System.out.println(list);
        System.out.println(list.size());
        Object anotherList = list.clone();
//        list.clear();
//        list.removeAll(otherList);
        System.out.println(list.contains(otherList));
        System.out.println(list.contains("LI"));
        System.out.println(list.indexOf("LI"));
        System.out.println(list.lastIndexOf("LI"));
        System.out.println(list.isEmpty());
        System.out.println(list);
        System.out.println(anotherList);

        Object[] newArray = list.toArray();
        System.out.println(newArray.getClass());
        ArrayList realAnotherList = (ArrayList)anotherList;
        System.out.println(realAnotherList);

    }
}
