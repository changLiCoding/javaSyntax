package ObjectInJava;

public class ArrayInJava {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Chang";
        names[1] = "Li";
        names[2] = "Chang";
        names[3] = "Li";
        for (String name : names) {
            System.out.println(name);
        }

        Object[] objs = new Object[2];
        for (Object obj : objs) {

            System.out.println(obj);
        }

        int[] arrNum = {2,4,2,5,315,34};
        for (int i : arrNum) {
            System.out.println(i);
        }

        String[][] twoDNames = {names, names};
        for (String[] twoDName : twoDNames) {
            for (String name : twoDName) {
                System.out.println(name);
            }
        }

        String[][] twoDNums = new String[2][3];
        twoDNums[0][0] = "1";
        twoDNums[0][1] = "2";
        twoDNums[0][2] = "3";
        twoDNums[1][0] = "4";
        twoDNums[1][1] = "5";
        twoDNums[1][2] = "6";


    }
}
class User1 {

}