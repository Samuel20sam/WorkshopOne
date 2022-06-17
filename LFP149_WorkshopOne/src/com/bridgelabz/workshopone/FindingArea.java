package com.bridgelabz.workshopone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FindingArea {
    List<Double> store = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    public void circleArea(){
        System.out.println("Enter the radius of the circle in mm");
        double radius = in.nextInt();
        double power = 2;
        double area = Math.PI * Math.pow(radius, power);
        store.add(area);
        store.add(area/10);
        store.add(area/1000);
    }

    public static void main(String[] args) {
        FindingArea obj = new FindingArea();
        obj.circleArea();
        System.out.println("The area of the circle is: "
                + obj.store.get(0)+" mm which is " + obj.store.get(1) +" cm which is " + obj.store.get(2)+" m");
    }
}