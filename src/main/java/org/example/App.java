package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;
//import java.util.Formatter;

public class App {
    static final double constant = 0.09290304;

    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        String length = se.nextLine();
        double len = Double.parseDouble(length);

        System.out.print("What is the width of the room in feet? ");
        String width = se.nextLine();
        double wid = Double.parseDouble(width);

        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");

        double fArea = len * wid;
        double mArea = fArea * constant;

        System.out.println("The area is \n" + String.format("%.0f", fArea) + " square feet\n" + String.format("%.3f", mArea) + " square meters");
    }
}
