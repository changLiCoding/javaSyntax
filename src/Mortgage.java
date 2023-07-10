import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {
        byte MOUNTHS_IN_YEAR = 12;
        byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);

        int principal;

        while (true) {
            System.out.print("Principal(1K to 1M): ");
            principal = scanner.nextInt();

            if (principal >= 1_000 && principal <= 100_000_000) break;
            System.out.println("Principal should be between 1000 to 100000000. Please try again. ");
        }

        float annulInterest;
        float monthlyInterest;
        while (true) {
            System.out.print("Annual Interest Rate: " );
            annulInterest = scanner.nextFloat();
            monthlyInterest = annulInterest / PERCENT / MOUNTHS_IN_YEAR;

            if(annulInterest >=1 && annulInterest <= 30) break;
            System.out.println("Annual rate should be between 1 to 30");
        }






        System.out.print("Period(Year): ");
        byte years = scanner.nextByte();

    }
}
