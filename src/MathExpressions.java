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
//      implicit casting
//      byte > short > int > long > float > double
        float d = x + z + 0.3f ;
        int e = (int)d + z;
        System.out.println(e);
        System.out.println(z);
        System.out.println(d);
        System.out.println(res + resDiv + resRealDiv + resDoubleDiv);

        String c = "1.1";
        double f = Float.parseFloat(c) + 1.1f;
        System.out.println(f);


    }
}
