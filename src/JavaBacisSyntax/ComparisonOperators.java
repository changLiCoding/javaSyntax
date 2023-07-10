package JavaBacisSyntax;

public class ComparisonOperators {
    static public void main(String[] args) {
        int x = 1;
        int y = 2;
        System.out.println(x == y);
        System.out.println(x <= y);

        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        boolean notWorthToLive = temperature < - 50 || temperature > 50;
        System.out.println(isWarm + " " + notWorthToLive);

        if (isWarm) {
            temperature = 80;

            System.out.println("It is a warm day!");
        }

        if (notWorthToLive) {
            temperature = 80;
            System.out.println(temperature);
        }

        System.out.println(temperature);

        int income = 120_000;
        boolean hasHightIncome = (income >= 100_000);
        System.out.println(hasHightIncome);

        String className = income > 100_000 ? "First" : "Economy";
        System.out.println(className);

    }
}
