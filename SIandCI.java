// Java program to find
// Simple and Compound Interest

class SIandCI {

    public static void main(String args[]) {

        // Variable Declaration
        int Time = 5;
        double Principle = 10000, Rate = 10.25, CI, SI;

        // Calculate Simple and Compound Interest
        SI = (Principle * Rate * Time) / 100;
        CI = Principle * (Math.pow((1 + Rate / 100), Time)) - Principle;

        // Print out SI and CI
        System.out.println("Simple Interest = " + SI);
        System.out.println("Compound Interest = " + CI);
    }
}
