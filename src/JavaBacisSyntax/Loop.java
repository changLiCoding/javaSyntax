package JavaBacisSyntax;

import java.util.Scanner;

public class Loop {
    static public void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
        int count = 0;
        while (count <= 5) {
            count++;
            System.out.println(count+ " Times Called");
        }

//        String input = "";
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.print("Your input is: ");
//            input = scanner.nextLine().toLowerCase().trim();
//            if (input.equals("pass")) continue;
//            if (input.equals("quit"))  break;
//
//            System.out.println("Input is: " + input);
//        }
//
//        do {
//            System.out.print("Your input is: ");
//            input = scanner.nextLine().toLowerCase().trim();
//            if (input.equals("pass")) continue;
//            if (input.equals("start"))  break;
//            System.out.println("Input is: " + input);
//        } while (!input.equals("start"));

        for (int i  = 1; i <= 10; i++) {
            if(i == 5) break;
            System.out.println(i);
        }

        for (int i = 1; i <= 10; i++) {
            if(i % 2 == 0) continue;
            System.out.println(i);
        }

        Scanner ageScanner = new Scanner(System.in);

        while(true) {
            System.out.print("Your age: ");
            int inputAge = ageScanner.nextInt();

            if (inputAge <= 7)
                System.out.println("You are a kid!");
            else if (inputAge > 8 && inputAge <= 18)
                System.out.println("You are a teenager!");
            else if (inputAge > 18 && inputAge < 40)
                System.out.println(" You are still young!");
            else if (inputAge == 999)
                System.out.println("You got it!");
            else if (inputAge == 1000) {
                System.out.println("You are fucked! ");
                break;
            }
        }

    }
}
