package Patterns;

import java.util.*;

//refer video: https://www.youtube.com/watch?v=GjHNGM7KN3w&list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop&index=5
//Hollow Rectangle 
public class Pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int cols = scn.nextInt();
        int rows = scn.nextInt();

        for (int i = 1; i <= cols; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == 1 || i == cols || j == 1 || j == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }
    }
}
