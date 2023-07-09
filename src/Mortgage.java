import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {
        byte MOUNTHS_IN_YEAR = 12;
        byte PERCENT = 100;

        Scanner scanner = new Scanner();
        System.out.println("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annulInterest = scanner.nextFloat();
        float monthlyInterest = annulInterest / PERCENT / MOUNTHS_IN_YEAR;

        System.out.print("Period(Year): ");
        byte years = scanner.nextByte();
        int nunmberOfPayment
    }
}
