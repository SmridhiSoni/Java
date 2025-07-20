package Maths;

import java.util.*;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        while (num > 0) {
            System.out.println(num % 10);
            num = num / 10;
        }

    }
}
