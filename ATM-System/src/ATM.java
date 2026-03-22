import java.util.Scanner;

class ATM {
    private Account account;
    private Scanner sc = new Scanner(System.in);

    public ATM(Account account) {
        this.account = account;
    }

    public void start() {
        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        if (!account.authenticate(pin)) {
            System.out.println("Invalid PIN.");
            return;
        }

        int choice;
        do {
            System.out.println("\n1. Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Balance: " + account.getBalance());
                case 2 -> {
                    System.out.print("Enter amount: ");
                    account.deposit(sc.nextDouble());
                }
                case 3 -> {
                    System.out.print("Enter amount: ");
                    account.withdraw(sc.nextDouble());
                }
            }
        } while (choice != 4);
    }
}
