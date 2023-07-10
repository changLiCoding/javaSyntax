package JavaBacisSyntax;

public class RealMath {

    static public void main(String[] args) {
        int roundRes = Math.round(124.212f);
        System.out.println(roundRes);
        int ceilRes = Math.round(124.212F);
        System.out.println(ceilRes);
        int floorRes = (int)Math.floor(124.212F);
        System.out.println(floorRes);
        int maxRes = Math.max(2,4);
        double randomDouble = Math.random();
        System.out.println(randomDouble);
    }
}
