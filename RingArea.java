import java.util.Scanner;

public class RingArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter R1:");
        double r1 = sc.nextDouble();
        System.out.println("Please, enter R2:");
        double r2 = sc.nextDouble();
        System.out.println("R1: " + r1 + ", R2: " + r2);
        double res = 0;
        res = Math.PI * Math.pow(r1, 2) - Math.PI * Math.pow(r2, 2);
        System.out.println("Square of ring:" + res);
    }
}
