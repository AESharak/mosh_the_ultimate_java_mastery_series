import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Mango", "Orange"};

        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);

        System.out.println("////////////////");

        // this enhanced for or forEach loop is good at writing
        // for simplicity but has some limitations
        // 1. we cannot loop backward it's only forward, apple mango orange
        // and not orange mango apple
        // 2. we don't have access to the current index, we need it in some cases
        for (String fruit : fruits){
            System.out.println(fruit);
        }




    }
}