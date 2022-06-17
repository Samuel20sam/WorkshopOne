package com.bridgelabz.workshopone;

import java.util.Arrays;

public class PrintingString {
    static String[] hobbies = {"cycling", "reading", "music"};

    public static void main(String[] args) {
        System.out.println("\nMy hobbies are ");
        for (String data : hobbies)
            System.out.print(data +", ");
        System.out.print(".");

            System.out.println("\nMy hobbies are: " + Arrays.toString(hobbies));
    }
}