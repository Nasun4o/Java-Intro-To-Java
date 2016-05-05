package bg.softuni;

import java.util.Scanner;

public class PrintCharacterTriangle {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        int count = 1;
        char currChar = 'a';

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < count - 1; j++) {
                System.out.printf("%c ", currChar);
                currChar++;
            }
            System.out.println();
            currChar = 'a';
            count++;
        }

        count -= 1;

        for (int i = 0; i < number - 1; i++) {
            count -=1;
            for (int j = 0; j < count -1; j++) {
                System.out.printf("%c ", currChar);
                currChar++;
            }
            System.out.println();
            currChar = 'a';


        }
    }
}
