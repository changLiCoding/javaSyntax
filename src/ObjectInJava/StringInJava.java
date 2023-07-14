package ObjectInJava;

public class StringInJava {
    public static void main(String[] args) throws Exception {
        String name = "CHANGLI";
        char[] nameChar = {'c', 'h', 'a', 'n', 'g'};
        byte[] bs = {-28, -72, -83, -27, -101, -67};


        String nameStr = new String(nameChar);
        String nameStr1 = new String(bs, "UTF-8");

        System.out.println(nameStr);
        System.out.println(nameStr1);

        System.out.println("\'");
        System.out.println("\"");
        System.out.println("a\tb");
        System.out.println("A\nB");


    }
}
