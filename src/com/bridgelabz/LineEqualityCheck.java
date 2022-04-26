package com.bridgelabz;

class Point{
    private int x, y;
    Point(int px, int py) {
        this.x = px;
        this.y = py;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public String calculateLineLength(Point p){
        double length = Math.sqrt((this.getX() - p.getX()) * (this.getX() - p.getX())
                + (this.getY() - p.getY()) * (this.getY() - p.getY()));
        String lineLength = Double.toString(length);
        System.out.println(lineLength);
        return lineLength;
    }
}
class LineComparator {
    public void compareLinesUsingEquals(String len1, String len2) {
        System.out.println("COMPARISON USING equals(): ");
        if (len1.equals(len2))
            System.out.println("Both lines are of equal length.");
        else
            System.out.println("Both lines are of unequal lengths.");
    }
    public void compareLinesUsingCompareTo(String len1, String len2) {
        System.out.println("COMPARISON USING compareTo(): ");
        if (len1.compareTo(len2) == 0)
            System.out.println("Both lines are of equal length.");
        else if (len1.compareTo(len2) > 0)
            System.out.println("Line1 is greater than line2.");
        else
            System.out.println("Line2 is greater than line1.");
    }
}
public class LineEqualityCheck {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program.");

        Point p1 = new Point(1,1);
        Point p2 = new Point(5,5);
        Point p3 = new Point(2,2);
        Point p4 = new Point(6,5);

        /* calculate length of line1 from point p1 to p2 */
        String length1 = p1.calculateLineLength(p2);
        /* calculate length of line2 from point p3 to p4 */
        String length2 = p3.calculateLineLength(p4);

        LineComparator l1 = new LineComparator();
        l1.compareLinesUsingEquals(length1, length2);
        l1.compareLinesUsingCompareTo(length1, length2);
    }
}
