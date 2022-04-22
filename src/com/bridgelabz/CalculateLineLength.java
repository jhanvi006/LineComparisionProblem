package com.bridgelabz;

import java.util.Scanner;

public class CalculateLineLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //take co-ordinate values of point 1 from user
        System.out.println("Enter x and y coordinates of point 1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        //take co-ordinate values of point 2 from user
        System.out.println("Enter x and y coordinates of point 2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        //calculate length of line between point 1 and point 2
        double length = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("Length of line between ("+x1+", "+y1+") and ("+x2+", "+y2+") is: "+String.format("%.3f", length));
    }
}
