package Intro;

import java.util.*;

public class IntroTo2D {

    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        print2DArray(arr);
        insert2DArray(arr, 1, 1, 34);
        delete2DArray(arr, 1, 0);
        print2DArray(arr);
        JacggedArray();

    }

    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void insert2DArray(int[][] arr, int row, int col, int val) {
        // pass the row of array in which insertion happens
        Intro.insertArray(arr[row], val, col);
    }

    public static void delete2DArray(int[][] arr, int row, int col) {
        Intro.deleteArray(arr[row], col);
    }

    public static void JacggedArray() {
        int[][] arr1 = new int[2][];
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = new int[2];
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = scn.nextInt();
            }
        }
        print2DArray(arr1);

    }
}
