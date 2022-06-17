package com.bridgelabz.workshopone;

import java.util.Arrays;
public class StoreArrayInReverseWithMethod {
    static int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    static void reverse(int[] arr, int num) {
        int i, j, p;
        for (i = 0; i < num / 2; i++) {
            j = arr[i];
            arr[i] = arr[num - i - 1];
            arr[num - i - 1] = j;
        }
        System.out.println("Reversed array is: ");
        for (p = 0; p < num; p++) {
            System.out.println(arr[p]);
        }
    }

    public static void main(String[] args) {
        System.out.println("List length is: " + list.length + " and array is " + Arrays.toString(list));
        reverse(list, list.length);
    }
}