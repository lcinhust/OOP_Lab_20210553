package Ex2;

import java.util.Scanner;

public class LinearEquation {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double a;
        do {
            System.out.println("Enter a:");
            a = scan.nextDouble();
        } while (a == 0);
        System.out.println("Enter b:");
        double b = scan.nextDouble();
        System.out.println("Solution: " + Double.toString(-b / a));
        scan.close();
        System.exit(0);
    }
}
