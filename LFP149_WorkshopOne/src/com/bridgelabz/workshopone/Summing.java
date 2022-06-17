package com.bridgelabz.workshopone;

public class Summing {
    int[] array = {25, 14, 62, 17, 54, 80, 16, 50, 40};
    int a = 5;
    static  int b = 10;

    public static void main(String[] args) {
        Summing obj = new Summing();

        int sum = 0;
        for (int k : obj.array)
            sum += k;
        System.out.println("\nSum of array is:" +sum);

        System.out.println("\n" +obj.a);
        System.out.println("\n" +b);
    }
}