import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("If you type quit you end the program");
        System.out.print("please enter any value: ");
        String inputtedWord =  sc.nextLine();


        while (!inputtedWord.equalsIgnoreCase("quit")) {
            System.out.println("I will loop till you write quit");
            System.out.print("please enter any value: ");
            inputtedWord = sc.nextLine();
        }



    }
}