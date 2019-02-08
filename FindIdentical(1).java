import java.util.Scanner;

public class FindIdentical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, input three numbers: ");
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        System.out.println("First: " + first + ",  Second: " + second + ",  Third: " + third);
        if (first == second) {
            if (first == third) {
                System.out.println("All numbers are equals!");
            } else {
                System.out.println("First is equals to second");
            }
        } else {
            if (first == third) {
                System.out.println("First is equals to third");
            } else {
                if (second == third) {
                    System.out.println("Second is equals to third");
                } else {
                    System.out.println("There is no equals");
                }
            }
        }
    }
}
