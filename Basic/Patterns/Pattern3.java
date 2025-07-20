
package Patterns;

import java.util.*;

//refer video: https://www.youtube.com/watch?v=GjHNGM7KN3w&list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop&index=5
public class Pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int cols = scn.nextInt();
        // int rows = scn.nextInt();
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
