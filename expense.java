import java.util.*;

class expense {
    public static void main(String[] args) {

        Tracker t = new Tracker();
        t.addExpense();

        System.out.println("Total Expense : " + t.total);
    }
}

class Tracker {

    int total = 0;

    void addExpense() {

        Scanner sc = new Scanner(System.in);
        int choice = 1;

        while (choice == 1) {

            System.out.print("Food : ");
            String food = sc.nextLine();

            System.out.print("Expense : ");
            int amount = sc.nextInt();

            total = total + amount;

            System.out.println("0 to Exit or 1 to Continue");
            choice = sc.nextInt();

            sc.nextLine();
        }
    }
}