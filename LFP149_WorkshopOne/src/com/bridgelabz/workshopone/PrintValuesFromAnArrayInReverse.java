package com.bridgelabz.workshopone;

import java.util.Arrays;

public class PrintValuesFromAnArrayInReverse {

    public static void main(String[] args) {
        System.out.println("Original array is: " + Arrays.toString(StoreArrayInReverseWithMethod.list));
        System.out.println("Reversed array is: ");
        for (int a = StoreArrayInReverseWithMethod.list.length - 1; a >= 0; a--)
            System.out.println(StoreArrayInReverseWithMethod.list[a]);
    }
}