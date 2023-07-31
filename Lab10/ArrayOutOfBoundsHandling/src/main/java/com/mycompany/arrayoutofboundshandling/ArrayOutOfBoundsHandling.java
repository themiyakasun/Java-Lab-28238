
package com.mycompany.arrayoutofboundshandling;

import java.util.Scanner;

public class ArrayOutOfBoundsHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.print("Enter the index to access: ");
        int index = scanner.nextInt();

        try {
            int value = array[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. Please enter a valid index within the array bounds.");
        }

        scanner.close();
    }
}
