package ObjectInJava;

public class ArraySort {
    public static void main(String[] args) {
        int[] nums = {2,4,1, 8, 3,5, 6, 10};

        nums = selectedSorting(nums);
        printArray(nums);
    }

    public static int[] sortNums(int[] arr) {
        for( int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++ ) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] insertSorting(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int comparedIndex = i - 1;
            while(comparedIndex >= 0 && arr[comparedIndex] > curr ) {
                arr[comparedIndex + 1] = arr[comparedIndex];
                comparedIndex--;

            }
            arr[comparedIndex+1] = curr;

        }
        return arr;
    }

    public static int[] selectedSorting(int[] arr) {
        int lengthNeedToChecked = arr.length - 1;

        while (lengthNeedToChecked >= 0) {

            int maxIndex = 0;
            for (int i = 0; i <= lengthNeedToChecked; i++) {
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }
            int temp = arr[lengthNeedToChecked];
            arr[lengthNeedToChecked] = arr[maxIndex];
            arr[maxIndex] = temp;
            lengthNeedToChecked--;
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}


