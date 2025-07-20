package Maths;

import java.util.Scanner;

public class PrintAllPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        for (int i = low; i <= high; i++) {
            for (int j = 2; j * j <= i; j++) {
                if (i % j != 0) {
                    System.out.print(i + " ");
                    // forgot this
                    break;
                }
            }
        }
    }
}
