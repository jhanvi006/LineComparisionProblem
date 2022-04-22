package com.bridgelabz;

import java.util.Objects;
import java.util.Scanner;

public class LineEqualityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //line 1
        //take co-ordinate values of point 1 from user
        System.out.println("Enter x and y coordinates of point 1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        //take co-ordinate values of point 2 from user
        System.out.println("Enter x and y coordinates of point 2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        //line 2
        //take co-ordinate values of point 1 from user
        System.out.println("Enter x and y coordinates of point 1: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        //take co-ordinate values of point 2 from user
        System.out.println("Enter x and y coordinates of point 2: ");
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        //calculate length of line1 between point 1 and point 2
        String length1 = Double.toString(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
        //calculate length of line1 between point 1 and point 2
        String length2 = Double.toString(Math.sqrt(Math.pow(x4-x3,2)+Math.pow(y4-y3,2)));

        if (length2.equals(length2))
            System.out.println("Two lines are equal.");
        else
            System.out.println("Two lines are not equal.");
    }
}
