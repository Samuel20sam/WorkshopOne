package com.bridgelabz.workshopone;

import java.util.Scanner;

public class CompareValues {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        CompareValues obj = new CompareValues();

        System.out.println("Enter the length value");
        int length = obj.in.nextInt();
        System.out.println("Enter the breath value");
        int breath = obj.in.nextInt();
        if (length == breath)
        {
            System.out.println("Both length and breath are equal");
        } else {
            System.out.println("Length and breath are not equal");
        }
    }
}
