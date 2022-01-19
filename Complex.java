import java.util.Scanner;

class Complex {
    double x, y;
    double a, b;

    public Complex(Scanner sc) {
        System.out.println("Enter the real value of complex number 1");
        x = sc.nextDouble();
        System.out.println("Enter the imaginary value of complex number 1");
        y = sc.nextDouble();
        System.out.println("Enter the real value of complex number 2");
        a = sc.nextDouble();
        System.out.println("Enter the imaginary value of complex number 2");
        b = sc.nextDouble();
    }

    public double[] absolute() {
        double[] temp = new double[2];
        temp[0] = Math.sqrt(x * x + y * y);
        temp[1] = Math.sqrt(a * a + b * b);
        return temp;
    }

    public void display() {
        System.out.println(x + " + i" + y);
        System.out.println(a + " + i" + b);
    }

    public static void main(String args[]) {
    }
}
