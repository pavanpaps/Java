class ArraySegregate {

    public static void main(String[] args) {
        int a[] = { 10, 53, 22, 21, 86, 92 };

        int ecnt = 0;
        int ocnt = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                ecnt++;
            else
                ocnt++;
        }
        int even[] = new int[ecnt];
        int odd[] = new int[ocnt];

        int k = 0, t = 0;
        for (int i = 0; i < ecnt; i++) {
            if (a[i] % 2 == 0) {
                even[k] = a[i];
                k++;
            } else {
                odd[t] = a[i];
                t++;
            }
        }

        System.out.println("The array with even elements = ");
        for (int i = 0; i < ecnt; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println("");
        System.out.println("The array with odd elements = ");
        for (int i = 0; i < ocnt; i++) {
            System.out.print(odd[i] + " ");
        }

    }
}