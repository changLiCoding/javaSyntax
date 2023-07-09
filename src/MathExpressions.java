public class MathExpressions {
    static public void main(String[] args) {
        int res = 10 + 3;
        int resDiv = 10 / 3;
        float resRealDiv = 10 /3F;
        double resDoubleDiv = (double)10 / (double)3;
        int x = 1;
        x+=2;
        System.out.println(x);
        int y = x++;
        System.out.println(x);
        System.out.println(y);
        y = ++x;
        System.out.println(x);
        System.out.println(y);
        x = x + 3 * 2;
        System.out.println(x);
        int z = x + y;
        float d = x + 0.3f;
        Rowal dnwnnw
        System.out.println(z);
        System.out.println(res + resDiv + resRealDiv + resDoubleDiv);
    }
}
