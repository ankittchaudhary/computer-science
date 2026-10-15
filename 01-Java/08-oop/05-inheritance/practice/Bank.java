package practice;

import java.time.LocalDate;

class Account{
    protected String accountNumber;
    protected String accountHolderName;
    protected LocalDate dob;
    protected double balance;
    protected LocalDate dateOpened;
    protected String accountStatus; //active , frozen , closed

    private static int inc=1;

    //constructor
    public Account(String accountHolderName, LocalDate dob, double balance ){ 

        this.accountNumber="ACC0"+inc++;
        this.accountHolderName=accountHolderName;
        this.dob=dob;
        this.balance=balance;
        this.dateOpened=LocalDate.now();
        this.accountStatus="active";
    }

    //getters and setters
    public String getAccountNumber() { return accountNumber; }

    public String getAccountHolderName() { return accountHolderName; }
    public void setAccountHolderName(String accountHolderName) { this.accountHolderName = accountHolderName; }

    public LocalDate getDob() { return dob; }
    public void setDob(LocalDate dob) { this.dob = dob; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public LocalDate getDateOpened() { return dateOpened; }

    public String getAccountStatus() { return accountStatus; }
    public void setAccountStatus(String accountStatus) { this.accountStatus = accountStatus; }


    //common method
    public void displayAccountInfo(){
        System.out.println("Acc Number: " + accountNumber + " | Holder: " + accountHolderName + " | Balance: " + balance);
    }
}


class SavingsAccount extends Account {
    private double interestRate;

    // Constructor: Uses super() to call Parent Constructor
    public SavingsAccount(String accountHolderName, LocalDate dob, double balance, double interestRate) {
        super(accountHolderName, dob, balance); 
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest; 
        System.out.println("Interest of " + interest + " added. New Balance: " + balance);
    }

    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double interestRate) { this.interestRate = interestRate; }
}


class LoanAccount extends Account {
    private double loanAmount;

    public LoanAccount(String accountHolderName, LocalDate dob, double loanAmount) {
        // A loan starts with a negative balance (debt) or specific balance structure
        super(accountHolderName, dob, -loanAmount); 
        this.loanAmount = loanAmount;
    }

    
    public void payEMI(double amount) {
        balance += amount; // Reducing the debt
        System.out.println("EMI Payment of " + amount + " received. Remaining Loan Debt: " + Math.abs(balance));
    }

    public double getLoanAmount() { return loanAmount; }
    public void setLoanAmount(double loanAmount) { this.loanAmount = loanAmount; }
}

public class Bank {
    public static void main(String[] args) {
        // Creating a Savings Account (Pass date using LocalDate.of)
        SavingsAccount savings = new SavingsAccount("Amit Sharma", LocalDate.of(1995, 5, 20), 50000.0, 4.0);
        savings.displayAccountInfo();
        savings.addInterest();

        System.out.println("------------------------------------------------");

        // Creating a Loan Account
        LoanAccount loan = new LoanAccount("Rahul Verma", LocalDate.of(1988, 11, 12), 200000.0);
        loan.displayAccountInfo();
        loan.payEMI(15000.0);
    }
}