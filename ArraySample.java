class ArraySample {

    public static void main(String args[]) {
        int n[] = new int[10];
        for (int i = 0; i < n.length; i++) {
            n[i] = i + 10;
        }
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
}