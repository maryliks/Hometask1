import java.util.Scanner;

public class DinosaurMass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter mass of dinosaur(kilo):");
        double kilo = sc.nextDouble();
        double milligram, gram, ton;
        milligram = 0.000001 * kilo;
        gram = 0.001 * kilo;
        ton = 1000 * kilo;
        System.out.println("Mass in milligram: " + milligram);
        System.out.println("Mass in gram: " + gram);
        System.out.println("Mass in ton: " + ton);
    }
}
