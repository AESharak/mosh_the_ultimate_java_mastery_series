import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // casting (Implicit/Explicit)
        short x = 2;
        int y = x + 1; // Implicit casting
        // byte > short > int > long > float > double
        // both implicit and explicit casting must happen to compatible types
        // like numbers as above the casting happens seamlessly
        System.out.println(y);

        double a = 1.2;
        //int b = a + 2; // compilation error
        int b = (int)a + 2;
        double c = a + 2;
        System.out.println(b);
        System.out.println(c);

        String p = "1.1";
        //int d = (int)p + 2; // error
        double d = Double.parseDouble(p) + 2;

        // so in Java the casting between different types
        //especially between string and different numbers
        // we have to use Class.parseClass method
        // this method if it can't parse the value it throws an exception

    }
}