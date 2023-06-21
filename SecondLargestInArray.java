package day4assignment;

import java.util.Scanner;

public class SecondLargestInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        //find 2nd large number
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Largest number:" + array[n - 2]);
    }
}
