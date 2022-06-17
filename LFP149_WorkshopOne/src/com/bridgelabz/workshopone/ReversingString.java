package com.bridgelabz.workshopone;

public class ReversingString {
    String myName = "My name is Samuel Elijah";

    public static void main(String[] args) {
        ReversingString obj = new ReversingString();
        char[] reverse = obj.myName.toCharArray();
        for (int i = reverse.length - 1; i >= 0; i--)
            System.out.println(reverse[i]);
    }
}
