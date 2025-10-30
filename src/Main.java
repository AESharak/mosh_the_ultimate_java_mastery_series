import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

      // if we want to declare constants in our app
        //float PI = 3.14f;
        // with this I could do this
        //PI = 2.4f;
        // this is not correct as I want the PI variable to be constant
        // so how to do this in java

        final float PI = 3.14159265F;
        //PI = 2134F; // EXCEPTION cannot assign a value to final variable PI

        System.out.println(PI);






    }
}