package Maths;

import java.util.Scanner;

public class IsPrime {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int testCase = scn.nextInt();
        while (testCase > 0) {
            boolean isPrime = true;
            int n = scn.nextInt();
            if (n <= 1) {
                isPrime = false;
            }
            // instead of Math.sqrt uses i*i ( uses only int)
            int div = (int) Math.sqrt(n);
            for (int i = 2; i <= div; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(isPrime);
            testCase--;
        }
    }
}