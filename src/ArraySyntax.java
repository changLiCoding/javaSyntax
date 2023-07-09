import java.util.Arrays;

public class ArraySyntax {
    static public void main(String[] args) {
        System.out.println("Why ?");

        int[] numbs = new int[5];
        int[] newNumbs = {2,6,24,65,24};
        System.out.println(numbs.length);

        numbs[0] = 1;
        numbs[4] = 40;
        System.out.println(Arrays.toString(numbs));
        System.out.println(numbs);
        System.out.println(Arrays.toString(newNumbs));

        Arrays.sort(newNumbs);
        System.out.println(Arrays.toString(newNumbs));

        int[][] twoDArr = {{2,45,34}, {56,23,64}};
        System.out.println(Arrays.deepToString(twoDArr));
        twoDArr[0][0] = 2;
        twoDArr[0][1] = 54;
        twoDArr[0][2] = 4;

        System.out.println(Arrays.deepToString(twoDArr));
    }
}
