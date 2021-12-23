// Java program to find Circumference and
// Area of a Circle

class Circle {

    public static void main(String args[]) {

        // Variable Declaration
        double radius = 2.5, circumference, area;
        final double pi = 3.147;

        // Calculate Circumference and Area
        circumference = 2 * pi * radius;
        area = pi * radius * radius;

        // Print Circumference and area
        System.out.println("Area of circle of radius r = " + radius + " is = " + area);
        System.out.println("Circumference = " + circumference);
    }
}
