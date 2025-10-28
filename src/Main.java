import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // bad practice to declare multiple variables at the same line
        // int age = 30, temperature = 32;
        byte age = 30;
        //int viewsCount = 10_333_222_222; // will throw an error (missing L,l casting)
        long viewsCount = 10_333_222_222L;
        double price = 19.22;
        float degree = 87.88F; // f,F is mandatory here
        // numbers with decimal points are double by default
        // numbers with no decimal points are integer by default
        char grade = 'A'; // must be single character and must be in '' single quote
        boolean isEligible = false;
        Date now = new Date();
        System.out.println(now);


        Point point1 = new Point(1,2);
        Point point2 = point1;

        point1.x = 10;

        System.out.println(point2);
    }
}