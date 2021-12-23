class TwoObjects {

    int x = 10;

    public static void main(String args[]) {

        TwoObjects first = new TwoObjects();
        TwoObjects second = new TwoObjects();
        System.out.println("The value of x objects is equal to " + first.x + "," + second.x);
        second.x = 50;
        System.out.println("The value of x objects is equal to " + first.x + "," + second.x);
    }
}
