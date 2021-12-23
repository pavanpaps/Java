class Constructor {
    int a, b;

    public Constructor(int da, int db) {
        a = da;
        b = db;
    }

    public Constructor(int da) {
        a = da;
        b = 10;
    }

    public Constructor() {
        a = 30;
        b = 50;
    }

    public void disp() {
        System.out.println("A = " + a + " B = " + b);
    }

    public static void main(String args[]) {
        Constructor A = new Constructor(); /* Default Constructor */
        A.disp();
        Constructor B = new Constructor(10); /* Constructor with 1 parameter */
        B.disp();
        Constructor C = new Constructor(10, 20); /* Constructor with 2 parameters */
        C.disp();
    }
}
