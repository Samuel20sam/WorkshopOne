package com.bridgelabz.workshopone;

import java.util.Arrays;
public class StoreArrayInReverseWithoutMethod {
    int value = 2022;
    int reminder;
    int reverse;
    int[] array = {25, 14, 62, 17, 54, 80, 16, 50, 40};

    public static void main(String[] args) {
        StoreArrayInReverseWithoutMethod obj = new StoreArrayInReverseWithoutMethod();
        while (obj.value != 0) {
            obj.reminder = obj.value % 10;
            obj.reverse = obj.reverse * 10 + obj.reminder;
            obj.value = obj.value / 10;
        }
        System.out.println("\nThe number reverse is: " + obj.reverse);

        int i, j, p;
        for (i = 0; i < obj.array.length / 2; i++) {
            j = obj.array[i];
            obj.array[i] = obj.array[obj.array.length - i - 1];
            obj.array[obj.array.length - i - 1] = j;
        }
        System.out.println("\nThe reversed array is:");
        for (p = 0; p < obj.array.length; p++) {
            System.out.println(obj.array[p]);
        }

        //Using sort method from Array class

        System.out.println("\nThe original string is" + Arrays.toString(obj.array));
        Arrays.sort(obj.array);
        System.out.println("\nThe sorted array is:" + Arrays.toString(obj.array));
        System.out.println("\nThe elements of the array in reverse are:");
        for (int e = obj.array.length - 1; e >= 0; e--) {
            System.out.println(obj.array[e]);
        }
    }
}
