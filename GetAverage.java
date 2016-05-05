package bg.softuni;

import javafx.beans.binding.DoubleExpression;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class GetAverage{

    public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
        Double a = console.nextDouble();
        Double b = console.nextDouble();
        Double c = console.nextDouble();
        Double[] arrayD = new Double[] { a, b, c};
        getAverage(arrayD);
    }

    public static void getAverage(Double[] array){

        double sum = 0;

            for (Double num : array) {
                sum += num;

            }
        sum /= array.length;
        System.out.printf("%.2f", sum);
    }
}
