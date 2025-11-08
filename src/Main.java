import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
         FizzBuzz game
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("/* FizzBuzz Game */");
        System.out.print("Please Enter a Number: ");
        int inputtedNumber = sc.nextInt();

        if (inputtedNumber % 5 == 0 &&  inputtedNumber % 3 == 0) {
            System.out.println("FizzBuzz");
        } else if (inputtedNumber % 5 == 0) {
            System.out.println("Fizz");
        } else if (inputtedNumber % 3 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(inputtedNumber);
        }


    }
}