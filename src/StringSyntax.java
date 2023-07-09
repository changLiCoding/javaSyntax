public class StringSyntax {

    public static void main(String[] args) {
        String message = "Hello World, I just bought game Dave the Diver! And it is great. " + true;

        System.out.println(message);
        System.out.println(message.indexOf("D"));
        System.out.println(message.toUpperCase());
        System.out.println(message.length());
        System.out.println(message.endsWith("true"));
        System.out.println(message.startsWith("SKY"));
        System.out.println(message.indexOf("dave"));
        System.out.println(message.replace("Dave", "Chang"));
        System.out.println(message);

        String backslashMessage = "\"chang\" has a double quotes!  ";
        System.out.println(backslashMessage);

        String url = "c:\\windows\\something\tsomething\\something.java";
        System.out.println(url);
    }
}
