// Java program to read data of various types using Scanner class.

import java.util.Scanner;

class ScannerDemo {

    public static void main(String args[]) {

        // Declare the object and initialize with
        // predefined standard input object
        Scanner inp = new Scanner(System.in);

        // String input
        System.out.println("Enter a string");
        String name = inp.nextLine();

        // Numerical data input
        System.out.println("Enter an Integer");
        int x = inp.nextInt();

        // Floating data input
        System.out.println("Enter a floating value");
        float y = inp.nextFloat();

        // Print the values to check if the input was correctly obtained.
        System.out.println("String = " + name);
        System.out.println("Integer = " + x);
        System.out.println("Floating number = " + y);
    }
}
