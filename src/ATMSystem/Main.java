package ATMSystem;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(1, "Lulu", 12345, 5000000);
        ATM atm = new ATM();
        atm.validation(account1);
    }
}
