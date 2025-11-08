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
        int principal = 0;
        float annualInterestRate = 0;
        byte period = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("/** calculate your monthly mortgage **/");

        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = sc.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000");
        }


        while (true) {
            System.out.print("Annual Interest Rate: ");
            annualInterestRate = sc.nextFloat();
            if (annualInterestRate >= 1 && annualInterestRate <= 30)
                break;
            System.out.println("Enter a value greater than 1 and less than or equal 30");
        }


        while (true) {
            System.out.print("Period: ");
            period = sc.nextByte();
            if (period >= 1 && period <= 30)
                break;
            System.out.println("Enter a value between 1 and 30");
        }


        float monthlyRate = annualInterestRate / MONTHS_IN_YEAR / PERCENT;
        float NoOfPayments = period * MONTHS_IN_YEAR;
        float onePlusRToThePowerOfN =  (float)Math.pow((1 + monthlyRate), NoOfPayments);
        float mortgage = principal * ( monthlyRate * onePlusRToThePowerOfN / (onePlusRToThePowerOfN -1) );

        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));




    }
}