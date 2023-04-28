package Ex2;

import java.util.Scanner;

public class QuadraticFunction {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = scan.nextDouble();
        if (a == 0) {
            System.out.println("Error. a can't be equal to 0.\nEnter a:");
            a = scan.nextDouble();
        }
        System.out.println("Enter b:");
        double b = scan.nextDouble();
        System.out.println("Enter c:");
        double c = scan.nextDouble();
        scan.close();
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("The equation has no real roots.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("The equation has a double real root: x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The equation has two real roots: x1 = " + x1 + ", x2 = " + x2);
        }
        System.exit(0);
    }
}
