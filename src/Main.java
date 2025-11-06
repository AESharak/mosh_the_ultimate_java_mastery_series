import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
          making a new small project to calculate the monthly mortgage
         */

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner sc = new Scanner(System.in);

        System.out.println("/** calculate your monthly mortgage **/");
        System.out.print("Principal: ");
        int principal = sc.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = sc.nextFloat();

        System.out.print("Period: ");
        short period = sc.nextShort();

        float monthlyRate = annualInterestRate / MONTHS_IN_YEAR / PERCENT;
        float NoOfPayments = period * MONTHS_IN_YEAR;
        float onePlusRToThePowerOfN =  (float)Math.pow((1 + monthlyRate), NoOfPayments);
        float mortgage = principal * ( monthlyRate * onePlusRToThePowerOfN / (onePlusRToThePowerOfN -1) );

        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }
}