import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        System.out.println("Please, enter a four-digit number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();
        while (number != 0) {
            numbers.add(number % 10);
            number /= 10;
        }
        if (numbers.size() != 4) throw new IndexOutOfBoundsException("Enter another number");
        Collections.reverse(numbers);
        int tmp = 0;
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) > numbers.get(i)) {
                tmp--;
            }
            if (numbers.get(i - 1) < numbers.get(i)) {
                tmp++;
            }
        }
        if (tmp == numbers.size() - 1) {
            System.out.println("Increasing");
        } else if (tmp == -numbers.size() + 1) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Not sorted");
        }

    }
}

