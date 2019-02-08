import java.util.Scanner;

public class SwappingOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a: ");
        int a = sc.nextInt();
        System.out.println("Please enter b: ");
        int b = sc.nextInt();
        a += b;
        b -= a;
        a += b;
        b = Math.abs(b);
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }
}
