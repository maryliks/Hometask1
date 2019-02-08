import java.util.Scanner;

public class Reversion {
    public static void main(String[] args) {
        System.out.println("Please, enter a seven-digit number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (String.valueOf(Math.abs(n)).length() != 7) throw new IndexOutOfBoundsException("Enter another number");
        int reverseN = 0;
        while (n != 0) {
            reverseN = reverseN * 10 + n % 10;
            n /= 10;
        }
        System.out.println("Reverse n: " + reverseN);
    }
}
