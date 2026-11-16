//custom or user defined exception class

import java.util.Scanner;

//custom exception 1
class LowBalanceException extends Exception { // must inhertit Extension class
    // override toString or getMessage method for msg
    // @Override
    // public String toString() {
    // return "Cant withdraw, mimimum 5000 should be kept in bank account";
    // }

    // better way
    public LowBalanceException(String message) {
        super(message);
    }
}

class Account {
    private int balance;
    private String name;

    public Account(int balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public void checkBalance() {
        System.out.println(balance);
    }

    public void myInfo() {
        System.out.println("Hi: "+name + ", your bank balance is " + balance);
    }

    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println("deposited: " + amount + " successfully!");
    }

    public void withdraw(int amount) throws LowBalanceException {
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return;
        }

        if (balance - amount < 5000) {
            throw new LowBalanceException(
                    "Minimum balance of 5000 must be maintained.");
        }

        balance = balance - amount;
        System.out.println("Withdrawn " + amount + " successfully!");
        // try{
        // if(balance-amount<5000){
        // throw new LowBalanceException();
        // }else{
        // balance=balance-amount;
        // System.out.println("withdrawn "+amount+" successfully!");
        // }
        // } catch(LowBalanceException e){
        // System.out.println(e);
        // }
    }

}

public class CustomException {

    static boolean withdraw(int amount) throws LowBalanceException {
        return true;
    }

    public static void main(String[] args) {
        // user defined exception
        // let say in a bank, minmum 5000 should be mentioned

        Scanner sc = new Scanner(System.in);

        // open account
        Account ac1 = new Account(5000, "Ankit Chaudhary");
        System.out.println("Account opened successfully!");

        // ===panel
        System.out.println("============Welcome to our Bank=============");
        boolean running = true;
        while (running) {
            System.out.println("===================");
            System.out.println("1. check balance");
            System.out.println("2. Deposite amount");
            System.out.println("3. withdraw");
            System.out.println("4. see your info");
            System.out.println("5. exit");

            System.out.print("Enter a choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ac1.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    int amount = sc.nextInt();
                    if (amount <= 0) {
                        System.out.println("Enter valid amount: ");
                        break;
                    }
                    ac1.deposit(amount);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextInt();
                    if (amount <= 0) {
                        System.out.println("Enter valid amount: ");
                        break;
                    }
                    try {
                        ac1.withdraw(amount);
                    } catch (LowBalanceException e) {
                        System.out.println(e);
                    }
                    break;

                case 4:
                    ac1.myInfo();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        }

        sc.close();

    }
}
