package JavaBacisSyntax;

public class ForEachLoop {
    static public void main(String[] args) {
        double[] arr = {1,2,5.2,2.6,1.2,6,241,5.612};

        for (int i = 0; i < arr.length; i ++) {
            System.out.println(arr[i]);
        }

        for (double num: arr)
            System.out.println(num);
    }
}
