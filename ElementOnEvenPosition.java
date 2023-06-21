package day4assignment;

import java.util.Scanner;

public class ElementOnEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        //Elements of given array present on even position
        for (int i = 0; i < n; i = i + 2) {
            System.out.println(array[i]);
        }
    }
}
