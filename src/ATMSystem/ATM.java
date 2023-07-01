package ATMSystem;

import java.util.Scanner;

public class ATM {

    public void validation(Account account) {
        Scanner scanner = new Scanner(System.in);
        if (account.isLock()) {
            System.out.println("Your account has been locked");
            return;
        }

        int times = 1;
        while (times < 6) {
            System.out.print("Enter Your pass PIN:");
            int pin = Integer.valueOf(scanner.nextLine());
            if (pin == account.getPIN()) {
                option(account);
                return;
            } else {
                if (times == 5)
                    break;
                System.out.print("Wrong! " + (5 - times) + " left. ");
                times += 1;
            }
        }

        System.out.println("Your account has been locked");
        account.setLock(true);
        return;
    }

    private void option(Account account) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("---------Welcome to ATM menu--------");
            System.out.print("1. Withdraw");
            System.out.print("\n2. Deposit");
            System.out.print("\n3. Check Balance");
            System.out.print("\n4. Exit");
            System.out.print("\nSelect: ");
            int choose = Integer.valueOf(scanner.nextLine());
            if (choose > 4 || choose < 1) {
                System.out.println("----- invalid ------");
                continue;
            }
            Transaction transaction = new Transaction();
            switch (choose) {
                case 1:
                    while (true) {
                        System.out.println("Press 0 for exit");
                        System.out.print("Enter a number: ");
                        int balance = Integer.valueOf(scanner.nextLine());
                        if (balance == 0)
                            break;
                        if (balance < 0 || balance > account.getBalance()) {
                            System.out.print("invalid, ");
                            continue;
                        }
                        if (balance < 50000) {
                            System.out.println("The amont of money must large than or equal 50.000 VND");
                            continue;
                        }
                        if (!transaction.withdraw(account, balance))
                            System.out.println("Some things went wrong");
                        break;
                    }
                    break;
                case 2:
                    while (true) {
                        System.out.println("Press 0 for exit");
                        System.out.print("Enter the amount of money: ");
                        int money = Integer.valueOf(scanner.nextLine());
                        if(money == 0) break;
                        if (money < 50000) {
                            System.out.println("The amont of money must large than or equal 50.000 VND");
                            continue;
                        }
                        if (!transaction.deposit(account, money))
                            System.out.println("Some things went wrong");
                        break;
                    }
                    break;

                case 3:
                    transaction.checkBalance(account);
                    break;
                case 4:
                    System.out.println("------------> See you again");
                    return;
            }
        }
    }
}
