class TwoChange {

    // Initialize the variable x
    int x = 10;

    public void change() {
        x = 60;
    }

    public void increment() {
        x++;
    }

    public static void main(String args[]) {

        TwoChange A = new TwoChange();

        // Before any Changes
        System.out.println("Before Change = " + A.x);

        A.change();

        // New Changes
        System.out.println("After Change = " + A.x);

        A.increment();

        // Post Increment
        System.out.println("After Increment = " + A.x);
    }
}
