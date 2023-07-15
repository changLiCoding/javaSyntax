package ObjectInJava;

public class StringInJava {
    public static void main(String[] args) throws Exception {
        String name = "CHANG LI";
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

        String s = "a" + "b";
        String s1 = "ab";
        String s2 = 1 + s1 + 2;
        String s3 = s1 + 1 + 2;
        String s4 = 1 + 2 + s1;
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s.equals(s1));
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        System.out.println(s4.concat(s3));

        String name1 = "chang li";
        System.out.println(name.equals(name1));
        System.out.println(name.equalsIgnoreCase(name1));
        int i = name.compareTo(name1);
        System.out.println(i);

        String surname = name.substring(5,name.length());
        System.out.println(surname);
        String firstName= name.substring(0, "CHANG".length());
        System.out.println(firstName);

        String[] nameWithSpace = name.split(" ");
        System.out.println(nameWithSpace.length);
        for (String s5 : nameWithSpace) {
            System.out.println(s5);
        }

        String nameWithLotsOfSpaces = "     CHANG   LI      ";
        System.out.println(nameWithLotsOfSpaces.trim());

        String nameWithLowerFirst = nameWithLotsOfSpaces.replace("CHANG", "chang");
        System.out.println(nameWithLowerFirst);
        System.out.println(nameWithLotsOfSpaces.replaceAll("CHANG|LI", "replaced"));

        System.out.println(name.toLowerCase());
        System.out.println(name1.toUpperCase());
        System.out.println(name.equals(name1.toUpperCase()));
        System.out.println(name1.substring(0, 1).toUpperCase() + name1.substring(1));

        char[] chars = nameWithLotsOfSpaces.toCharArray();
        System.out.println(chars);
        byte[] bytes = nameWithLotsOfSpaces.getBytes("UTF-8");
        System.out.println(nameWithLotsOfSpaces.charAt(7));
        System.out.println(nameWithLotsOfSpaces.indexOf("C"));
        System.out.println(nameWithLotsOfSpaces.charAt(nameWithLotsOfSpaces.indexOf("C")));

        System.out.println(nameWithLotsOfSpaces.indexOf("LI"));
        String world = "Hello world world world world word Hello";
        System.out.println(world.lastIndexOf(world));

        System.out.println(world.contains("word"));
        System.out.println(world.startsWith("Hello"));
        System.out.println(world.endsWith("word"));

        String empty = "";
        System.out.println(empty.isEmpty());
        String spaceIn = " ";
        System.out.println(spaceIn.isBlank());

//        for (int j = 0; j < 100; j++) {
//            spaceIn = spaceIn + j;
//        }

//        String builder
        StringBuilder anotherEmpty = new StringBuilder("");
//        for (int j = 0; j < 100; j++) {
//            anotherEmpty.append(j);
//        }
        anotherEmpty.append("abc");
        System.out.println(anotherEmpty.length());
        anotherEmpty.reverse();
        System.out.println(anotherEmpty);
        anotherEmpty.insert(2, "d");
        System.out.println(anotherEmpty);
    }
}
