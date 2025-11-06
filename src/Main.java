import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        double randomNumber = Math.random();
        System.out.println(randomNumber);

        int randomNumberBetweenZeroAndHundred = (int)(Math.random() * 100);
        System.out.println(randomNumberBetweenZeroAndHundred);
    }
}