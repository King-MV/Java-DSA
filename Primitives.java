// A primitive data type is something that can't be divided into further small data type. Like a String "Mridul" can be divided into "M","R","I" and so on that means string is not a primitive data type. But "M" can't be divided any further hence its a primitive data type.

// import java.util.Scanner;

public class Primitives {
    public static void main(String[] args) {

        int rollno = 10;

        // A String is not a primitive data type.
        String nm = "Mridul";

        // A character is a primitive data type.
        char letter = 'M';

        // For decimal values.
        float mrk = 9.98f;

        // For large decimal numbers.
        double a = 3333333999999.9229;

        // For long integer values.
        long b = 999999900990000l;

        // For true or false.
        boolean check = false;

        System.out.println(rollno);
        System.out.println(nm);
        System.out.println(letter);
        System.out.println(mrk);
        System.out.println(a);
        System.out.println(b);
        System.out.println(check);
    }
}