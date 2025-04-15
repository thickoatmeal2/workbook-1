import java.util.Scanner;
package com.pluralsight;

public class MathApp {
    public static double main(String[] args) {

        {
        double bobSalary = 70000;
        double garySalary = 85000;

        double highestSalary;

        highestSalary = Math.max(bobSalary, garySalary);
        System.out.println(highestSalary);
    }
        double carPrice = 12000;
        double truckPrice = 12500;
        double a2 = Math.min(carPrice, truckPrice);
        System.out.println(a2);


        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println(area);

        double five = 5.0;
        double squareRoot = Math.sqrt(five);
        System.out.println("The square root of 5" + squareRoot);

        public static void main(String[] args) {
            int x1 = 5;
            int y1 = 10;
            int x2 = 85;
            int y2 = 50;

            double distance = calculateDistance(x1, y1, x2, y2);
            System.out.println("The distance between the points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is: " + distance);


            public static double calculateDistance(int x1, int y1, int x2, int y2) {
                return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        }


    }

     {


    }
}
