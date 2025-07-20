package Patterns;

import java.util.*;

/*
Pattern 1 
 * * * *
 * * * * 
 * * * *
 * * * *
 End
 */

public class Pattern1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int cols = scn.nextInt();
        int rows = scn.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
