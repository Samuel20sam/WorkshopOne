package com.bridgelabz.workshopone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LargestFromArray {
    List<Double> list = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        LargestFromArray obj = new LargestFromArray();
        System.out.println("Enter the length of the array");
        int arrayLength = obj.in.nextInt();

        System.out.println("Enter the array values");
        for (int i = 0; i < arrayLength; i++){
            obj.list.add(obj.in.nextDouble());
        }
        System.out.println("The largest number of the array is: " + Collections.max(obj.list));
    }
}