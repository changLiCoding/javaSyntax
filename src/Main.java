import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        System.out.printf("Hello World!!!");
        System.out.print(123123);
        System.out.println("Can you print any data type???" + false + 123123 + null);
        System.out.print(false);

        byte myAgeIs = 30;
        int notLargeNum = 123_123_123;
        long supperLargNum = 123_123_123_123_123_123L;
        float price = 10.99F;
        char letterOne = 'a';
        var myName = "Chang";
        boolean isEligible = true;

        System.out.print("Primitive type and reference type: ");
        Date now = new Date();

        System.out.print("Time of now is: " + now + " I am " + myName + ". My age is: " + myAgeIs + " And you have to add space?? It is so dum!! " + "And you have to be forced to use double quotes???!!!" + "And also why the IntelliJ not auto wrap my dum long code????");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 123123123; i = i + 10000000) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }
    }
}