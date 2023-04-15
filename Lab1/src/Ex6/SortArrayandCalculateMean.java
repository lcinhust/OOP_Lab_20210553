package Ex6;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayandCalculateMean {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int sz = scan.nextInt();
        int[] arr = new int[sz];
        System.out.println("Enter the values of the array:");
        for (int i = 0; i < sz; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < sz; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / sz;

        System.out.println("The sorted array is: " + Arrays.toString(arr));
        System.out.println("The sum of the array elements is: " + sum);
        System.out.println("The average of the array elements is: " + avg);
        System.exit(0);
    }
}