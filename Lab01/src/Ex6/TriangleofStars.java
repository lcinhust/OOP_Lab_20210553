package Ex6;

import java.util.Scanner;

public class TriangleofStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scan.nextInt();
        scan.close();
        for (int i = 1; i <= n; ++i) {
            String s = "";
            for (int j = n - i; j >= 1; --j) {
                s += ' ';
            }
            for (int j = 1; j < 2 * i; ++j) {
                s += '*';
            }
            System.out.println(s);
        }
        System.exit(0);
    }
}
