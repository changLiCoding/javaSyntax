package OOP;

public class RecursionOOP {
    static public void main(String[] args) {
        System.out.println(whileSum(9));
        System.out.println(recursionSum(10));
        System.out.println(recursionSum1(9));
        System.out.println(recursionMultiple(4));
    }

    static public int whileSum (int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num;
            num = num - 2;
        }
        return sum;
    }

    static public int recursionSum1 (int num ) {
        int sum = 0;
        if (num > 0 ) {
            sum = num + recursionSum1(num - 2);
        }
        return sum;
    }

    static public int recursionSum (int num) {
        num = num % 2 == 0 ? num - 1 : num;
        if (num == 1) {
            return 1;
        } else  {
        return num + recursionSum(num - 2);
    }}

    static public int recursionMultiple(int num) {
        if (num == 0 || num == 1) return 1;
        return num * recursionMultiple(num - 1);
    }
}


