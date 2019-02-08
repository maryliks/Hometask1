import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArithmeticGeometricMean {
    public static void main(String[] args) {
        System.out.println("Please, enter six-digit number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double arithmeticMean = 0;
        double geometricMean = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (number != 0) {
            list.add(number % 10);
            number /= 10;
        }
        if (list.size()!=6)throw new IndexOutOfBoundsException("Enter another number");
        int sum = 0;
        int multiply = 1;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
            multiply *= list.get(i);
        }
        arithmeticMean = sum / (double) list.size();
        geometricMean = Math.pow(multiply, 1 / (float) list.size());
        System.out.println("Arithmetic mean: " + arithmeticMean);
        System.out.println("Geometric mean: " + geometricMean);
    }
}
