import java.util.Scanner;

public class ReadingInput {
     static public void main (String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Your name: ");
         String name = scanner.nextLine().trim();
         System.out.println("You are " + name);


     }
}
