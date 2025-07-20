package Maths;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int counter = 0;
        while (num > 0) {
            num = num / 10;
            counter++;
        }

        System.out.println(counter);
    }
}
