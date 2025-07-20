package Fuctions;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        printNmae((name));
        System.out.println("My name is " + name);

    }

    public static void printNmae(String name) {
        System.out.println("My name is " + name);
    }
}
