package ReferenceTypeInJava;

import java.util.Random;
import java.util.UUID;

public class ToolClass {
    public static void main(String[] args) {

        System.out.println(StringUtil.isEmpty(""));
        System.out.println(StringUtil.isEmpty("    "));
        System.out.println(StringUtil.isEmpty("   "));
        System.out.println(StringUtil.isEmpty("dfsdf"));
        System.out.println(StringUtil.isEmpty(null));
        System.out.println(StringUtil.isEmpty("    df   "));
        System.out.println(StringUtil.randomStr());
        System.out.println(StringUtil.randomStr());
        System.out.println(StringUtil.randomStr());
        System.out.println(StringUtil.randomStr());
        System.out.println(StringUtil.makeStr("asdfasdfasdfjasdlfkjasldfjasldkf", 23));


    }
}
class StringUtil {
//    check if string is empty
    public static boolean isEmpty(String str) {
        if (str == null || "".equals(str.trim())) {
            return true;
        }
        return false;
    }
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    public static String randomStr() {
        return UUID.randomUUID().toString();
    }

    public static String makeStr(String from, int len) {
        if(len < 1) {
            return "";
        }
        char[] chars = from.toCharArray();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < len; i++) {
            Random rand = new Random();
            int j = rand.nextInt(chars.length);
            char c = chars[j];
            str.append(c);
        }
        return str.toString();
    }
}