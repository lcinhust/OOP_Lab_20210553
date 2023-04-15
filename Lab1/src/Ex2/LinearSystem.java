package Ex2;

import java.util.Scanner;

public class LinearSystem {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a11:");
        double a11 = scan.nextDouble();
        System.out.println("Enter a12:");
        double a12 = scan.nextDouble();
        System.out.println("Enter b1:");
        double b1 = scan.nextDouble();
        System.out.println("Enter a21:");
        double a21 = scan.nextDouble();
        System.out.println("Enter a22:");
        double a22 = scan.nextDouble();
        System.out.println("Enter b2:");
        double b2 = scan.nextDouble();
        scan.close();
        
        double detA = a11*a22 - a12*a21;
        if (detA == 0) {
            if (a11*b2 == a12*b1){
                System.out.println("There are infinitely many solutions");
            }else{
                System.out.println("There are no solutions");
            }
            return;
        }
        double det1 = b1*a22-b2*a12;
        double det2 = a11*b2-a21*b1;
        // Print the solution
        System.out.println("The solution is x1 = " + det1/detA + ", x2 = " + det2/detA);
        System.exit(0);
    }
}
