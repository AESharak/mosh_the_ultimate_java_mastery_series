import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // NumberFormat is abstract class. ie, we can not instantiate it
        // we can access some of its utilities which is methods or abstract methods
        // these methods are related to the class itself so it's a static method
        String result = NumberFormat.getCurrencyInstance().format(34243243.23);
        String percentage = NumberFormat.getPercentInstance().format(.23);

        System.out.println(result);
        System.out.println(percentage);
    }
}