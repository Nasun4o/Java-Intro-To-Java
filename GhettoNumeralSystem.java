package bg.softuni;

import java.util.HashMap;
import java.util.Scanner;

public class GhettoNumeralSystem {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        HashMap<Character, String> data = new HashMap<>();

        data.put('0', "Gee");
        data.put('1', "Bro");
        data.put('2', "Zuz");
        data.put('3', "Ma");
        data.put('4', "Duh");
        data.put('5', "Yo");
        data.put('7', "Hood");
        data.put('8', "Jam");
        data.put('9', "Mack");
        String input = console.nextLine();

        for (int i = 0; i < input.length(); i++)
        {
            if (data.containsKey(input.charAt(i)))
            {
                System.out.print(data.get(input.charAt(i)));
            }
        }
    }
}
