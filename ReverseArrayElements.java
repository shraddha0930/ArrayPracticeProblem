package day4assignment;

import java.util.Scanner;

public class ReverseArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        //Array in reverse order
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
