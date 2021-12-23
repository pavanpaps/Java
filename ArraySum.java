class ArraySum {
    public static void main(String args[]) {
        int a[] = { 15, 21, 22, 60, 31, 80 };
        int osum = 0;
        int esum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) /* if (a[i] & 1 == 0) Less no of cycles */
                esum = esum + a[i];
            else
                osum = osum + a[i];
        }
        System.out.println("Sum of odd numbers in given array is equal to " + osum);
        System.out.println("Sum of even numbers in given array is equal to " + esum);
    }
}
