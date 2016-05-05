package bg.softuni;

import java.text.MessageFormat;
import java.util.*;

public class AssignVariables {

    public static void main(String[] args) {
        /* Problem 3 */
       // Find suitable types for variables. You are given the following types: byte, short, int, long, char, boolean, float, double, and String.
        // Assign the following values to them false, “Palo Alto, CA”, 32767, 2000000000, 0.1234567891011, 0.5f, 919827112351L, 127, ‘c’.
        // Try to assign 32768 to short and see what happens.
        byte byteNumber = 127;
        short shortNumber = 32767;
        String stringInput =  "Palo Alto, CA";
        float floatNumber = 0.5f;
        double doubleNumber = 0.1234567891011;
        long longNumber = 919827112351L;
        int intNumber = 2000000000;
        char singleChar = 'c';
        boolean bool = false;

        System.out.println(MessageFormat.format("byte - {0}\nshort - {1}\nstring - {2}\nfloat - {3}\ndouble - {4}\n" +
                "long - {5}\nint - {6}\nchar - {7}\nboolean - {8}",
                byteNumber, shortNumber, stringInput, floatNumber,
                doubleNumber, longNumber, intNumber, singleChar, bool));
    }
}

