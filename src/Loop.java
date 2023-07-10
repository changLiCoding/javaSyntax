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

        String input = "";
        Scanner scanner = new Scanner(System.in);
        while (!input.equals("quit")) {
            System.out.print("Your input is: ");
            input = scanner.nextLine().toLowerCase().trim();
            if (input.equals("pass")) continue;
            if (input.equals("quit"))  break;

            System.out.println("Input is: " + input);
        }

        do {
            System.out.print("Your input is: ");
            input = scanner.nextLine().toLowerCase().trim();
            if (input.equals("pass")) continue;
            if (input.equals("start"))  break;
            System.out.println("Input is: " + input);
        } while (!input.equals("start"));
    }
}
