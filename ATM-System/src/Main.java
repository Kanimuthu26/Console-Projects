public class Main {
    public static void main(String[] args) {
        Account acc = new Account(1000, 1234);
        ATM atm = new ATM(acc);
        atm.start();
    }
}
