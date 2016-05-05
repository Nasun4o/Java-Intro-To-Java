package bg.softuni;

import java.util.*;
import java.lang.String;

public class SumNumbersFrom1ToN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberInput = input.nextInt();
        int maxSum = 0;

        for (int i = 0; i < numberInput; i++) {
            maxSum += i;
        }
        System.out.println("Total " + maxSum);

    }
}
