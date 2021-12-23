class ConstructorOverloading {
    int a, b;

    public ConstructorOverloading(int da, int db) {
        a = da;
        b = db;
    }

    public ConstructorOverloading(ConstructorOverloading D) {
        a = D.a;
        b = D.b;
    }

    public ConstructorOverloading() {
        a = 30;
        b = 50;
    }

    public void disp() {
        System.out.println("A = " + a + " B = " + b);
    }

    public static void main(String args[]) {
        ConstructorOverloading A = new ConstructorOverloading();
        ConstructorOverloading B = new ConstructorOverloading(60, 80);
        ConstructorOverloading C = new ConstructorOverloading(B);
        A.disp();
        B.disp();
        C.disp();
    }
}
