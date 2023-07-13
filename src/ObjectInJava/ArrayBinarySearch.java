package ObjectInJava;

import java.util.Random;
import ObjectInJava.ArraySort.*;

public class ArrayBinarySearch {
    public static void main(String[] args) {
        int[] unSortedNums = {2,4,1, 8, 3,5, 6, 10};

        int[] nums = randomArr(10);
        printArray(nums);
        System.out.println(" ");
        int[] newNums = insersionSorting(nums);
        printArray(newNums);

        System.out.println(binarySearch(unSortedNums, 5));
    }

    public static final int[] randomArr(int containOfArr) {
        Random rand = new Random();
        int[] nums = new int[containOfArr];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(100);

        }
        return nums;
    }

    public static final int[] insersionSorting(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int comparingIndex = i - 1;

            while(comparingIndex >= 0 && current < arr[comparingIndex]) {
                arr[comparingIndex + 1] = arr[comparingIndex];
                comparingIndex--;
            }
            arr[comparingIndex + 1] = current;

        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        int middle = 0;

        while(start <= end) {
            middle = Math.floorDiv((start + end ),  2);
            System.out.println(middle);

            if (arr[middle] > target) {
                end = middle - 1;
            } else if (arr[middle] < target) {
                start = middle + 1;
            } else {
                break;
            }
        }
        return middle;
    }

}

