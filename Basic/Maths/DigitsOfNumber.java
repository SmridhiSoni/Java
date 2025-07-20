package Maths;

import java.util.Scanner;

public class DigitsOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int count = countDigits(num);
        int divisor = (int) Math.pow(10, count - 1);
        while (divisor > 0) {
            System.out.println(num / divisor);
            num = num % divisor;
            divisor = divisor / 10;
        }
    }

    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}
