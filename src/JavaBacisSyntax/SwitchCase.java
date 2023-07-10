package JavaBacisSyntax;

import java.util.Scanner;

public class SwitchCase {
    static public void main(String[] args) {
        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("You are admin. ");
                break;
            case "moderator":
                System.out.println("You are moderator");
                break;
            default:
                System.out.println("You are guest. ");
        }

        System.out.print("Number: ");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
       if (num % 5 ==0 && num % 3 == 0)
           System.out.println("FizzBuzz");
       else if (num % 5 == 0 )
           System.out.println("Fizz");
       else if (num % 3 == 0)
           System.out.println("Buzz");




    }
}
