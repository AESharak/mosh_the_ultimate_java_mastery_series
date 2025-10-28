import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // the old syntax
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        //numbers[10] = 3; Exception out of bounds

        System.out.println(numbers); // a reference to the array [I@65ab7765
        // to print the real values in a string representation you need to do this

        System.out.println(Arrays.toString(numbers)); // [1, 2, 0, 0, 0]

        // arrays are with fixed size in java, fixed size once created never changed same datatype

        int[] newNumbers = { 2, 3, 4, 1, 5};
        //newNumbers[5] = 2; // Exception out of bounds

        Arrays.sort(newNumbers); // impure fn, it mutates the original array

        System.out.println(Arrays.toString(newNumbers));



    }
}