
package base;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 7 Solution
 *  Copyright 2021 Bao Kastan
 */

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        double length = myApp.getLength();
        double width = myApp.getWidth();

        double areaFeet = length * width;
        final double feetToMeters = 0.09290304;
        double areaMeters = areaFeet * feetToMeters;

        myApp.printOutput(areaFeet, areaMeters);
    }

    public void printOutput(double areaFeet, double areaMeters) {
        System.out.println("The area is");
        System.out.println(areaFeet + " square feet");
        DecimalFormat decFormat = new DecimalFormat("#.000");
        System.out.println(decFormat.format(areaMeters) + " square meters");
    }

    public double getLength() {
        System.out.println("What is the length of the room in feet? ");
        String num = in.nextLine();
        return Double.parseDouble(num);
    }

    public double getWidth() {
        System.out.println("What is the width of the room in feet? ");
        String num = in.nextLine();
        return Double.parseDouble(num);
    }
}
