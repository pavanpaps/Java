import java.util.Scanner;

public class ShoppingList {

    int count = 0;
    double code[] = new double[100];
    double cost[] = new double[100];
    static Scanner sc;

    public ShoppingList(Scanner scanner) {
        sc = scanner;
        System.out.println("Enter item code");
        code[count] = sc.nextDouble();
        System.out.println("Enter item Price");
        cost[count] = sc.nextDouble();
    }

    public void additem() {
        count++;
        System.out.println();
        System.out.println();
    }

    public void delete() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter item code");
        double c = inp.nextDouble();
        for (int i = 0; i < count; i++) {
            if (code[i] == c)
                cost[i] = 0;
        }
    }

    public void total() {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum = sum + cost[i];
        }
        System.out.println("Code\tPrice");
        for (int i = 0; i < count; i++) {
            System.out.print(code[i] + "\t" + cost[i] + "\n");
        }
        System.out.println("Total amount = " + sum + "\nCount = " + count);
        System.out.println("_________________");
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ShoppingList s = new ShoppingList(inp);
        int opt;
        do {
            System.out.println("You can do the following\n1:Add Item\n2:Remove item\n3:Total\n4:Quit");
            System.out.println("Enter your option");
            System.out.println("_________________");
            opt = inp.nextInt();
            switch (opt) {
                case 1:
                    s.additem();
                    break;
                case 2:
                    s.delete();
                    break;
                case 3:
                    s.total();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Error in input! Try again");
            }
        } while (opt != 4);
    }
}