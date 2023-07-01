package ATMSystem;

public class Transaction {
    public boolean withdraw(Account account, int balance) {
        try {
            account.setBalance(account.getBalance() - balance);
            System.out.println("------------> There are " + balance + " VND");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean deposit(Account account, int balance) {
        try {
            account.setBalance(account.getBalance() + balance);
            System.out.println("------------> Success");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void checkBalance(Account account){
        System.out.println("------------> There are " + account.getBalance() + " VND");
    }
}
