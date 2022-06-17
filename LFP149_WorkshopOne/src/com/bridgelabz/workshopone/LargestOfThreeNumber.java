package com.bridgelabz.workshopone;

import java.util.Scanner;
public class LargestOfThreeNumber {
    Scanner in = new Scanner(System.in);

    public double largestNumber(){
        System.out.println("Enter three numbers to be compared and show which among them is the largest");
        double numOne = in.nextDouble(), numTwo = in.nextDouble(), numThree = in.nextDouble();
        return Math.max(numThree, (Math.max(numOne, numTwo)));
//        return numThree > (numOne > numTwo ? numOne : numTwo) ? numThree : (numOne > numTwo ? numOne : numTwo);
    }

    public static void main(String[] args) {
        LargestOfThreeNumber obj = new LargestOfThreeNumber();
        System.out.println("Largest of the given numbers: " +obj.largestNumber());
    }
}