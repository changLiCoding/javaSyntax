package JavaBacisSyntax;

import java.text.NumberFormat;

public class FromatingNumber {
    static  public  void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String currencyStr = currency.format(123123.1231231234);
        System.out.println(currencyStr);
        NumberFormat percentage = NumberFormat.getPercentInstance();
        String percentageStr = percentage.format(1.412);
        System.out.println(percentageStr);
//        method Chains
        System.out.println(NumberFormat.getPercentInstance().format(0.45));
    }
}
