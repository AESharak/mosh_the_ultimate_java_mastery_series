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
        String inputtedWord =  "";


        do {
            System.out.print("please enter any value: ");
            inputtedWord = sc.nextLine();
            System.out.println(inputtedWord);
        } while (!inputtedWord.equalsIgnoreCase("quit"));



    }
}