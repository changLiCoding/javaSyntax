package ReferenceTypeInJava;

public class ConvertToReferenceType {
    public static void main(String[] args) {
        Byte b = null;
        Short s = null;
        Character c = null;

        int i = 10;
//        Integer i1 = Integer.valueOf(i);
        Integer i1 = i;
//        int i2 = i1.intValue();
        int i2 = i1;
        System.out.println(i1.hashCode());


    }
}
