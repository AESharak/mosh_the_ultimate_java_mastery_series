import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        String message = "Hello World" + "!!";

        // it creates a new string and not mutates the original message variable
        // replace is a pure fn
        System.out.println(message.replace("!", "&"));
        System.out.println("the real message kept unchanged: " +  message);
        System.out.println(message.endsWith("sky"));
        System.out.println(message.indexOf("now"));
        // the original string is immutable in java

        System.out.println("///////////////////////////////////////////");
        // you can use "\" the backslash to escape the "" to use it in the text
        // to print it in the code
        String anotherMessage = "Hello \"ahmed\"";
        System.out.println(anotherMessage);

        //if we need to escape the \ itself to store a path to a directory in windows
        String path = "c:\\Windows\\..";
        System.out.println(path);

    }
}