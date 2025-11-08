import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int income = 120_000;

        // will throw an error
        // as You have to use {} to declare a variable
//        if (income > 100_000)
//            boolean hasHighIncome = true;


        // the problem in this case is that hasHighIncome is scoped to this if block
        // and I can't access it outside this if block
        if (income > 100_000) {
            boolean hasHighIncome = true;
        }

        // another not good but still bad approach
//        boolean hasHighIncome;
//        if (income > 100_000) {
//            hasHighIncome = true;
//        } else {
//            hasHighIncome = false;
//        }

        // better approach but still not that good
//        boolean hasHighIncome = false;
//        if (income > 100_000) {
//            hasHighIncome = true;
//        }

        // the best approach right here
        boolean hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome);

    }
}