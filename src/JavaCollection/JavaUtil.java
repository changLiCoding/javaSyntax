package JavaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaUtil {
    public static void main(String[] args) {
        int[] is = {121,23,63,2,23123, 5};
        int[] is2 = {12,672,2,123,6,12,214};
        int[] is3 = {2, 5, 23, 63, 121, 23123};
        int[] is4 = {2, 5, 23, 63, 121, 23123, 24, 2123};
        String string = Arrays.toString(is);
        System.out.println(string);
        System.out.println(is);

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(integers.getClass());
        System.out.println(is.getClass());
        System.out.println(Arrays.toString(is));
//      Arrays sorting
        Arrays.sort(is);
        System.out.println(Arrays.toString(is));
//      Arrays binary search
        System.out.println(Arrays.binarySearch(is, 5));

//        Array compare
        System.out.println(is.equals(is2));
        System.out.println(is.equals(is3));
        System.out.println(Arrays.equals(is3, 0,5, is4,0,5));
    }
}
