package Intro;

import java.util.*;

public class Intro {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scn = new Scanner(System.in);
        // Input Array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        // Output Array
        // insertArray(arr, 78, 0);
        deleteArray(arr, 4);
        printArray(arr);

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertArray(int[] arr, int val, int pos) {
        if (pos < 0 || pos > arr.length - 1) {
            System.out.println("Invalid position");
            return;
        }
        // shift elements to right starting from second last element
        // Mistake:
        for (int i = arr.length - 2; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }

        arr[pos] = val;

    }

    public static void deleteArray(int[] arr, int pos) {
        if (pos < 0 || pos > arr.length - 1) {
            System.out.println("Invalid position");
        }
        for (int i = pos; i < arr.length - 1; i++) {
            arr[pos] = arr[pos + 1];
        }
        arr[arr.length - 1] = 0;
    }
}
