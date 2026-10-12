


class Bank {
    //1. Read & writable : Both getter and setter
    private int balance;
    
    // Getter
    public int getBalance(){
        return balance;
    }
    // Setter
    public void setBalance(int balance){
        this.balance=balance;
    }

    //2. Read Only: Getter method only
    private String accountNumber;

    //Getter
    public String getAccountNumber(){
        return accountNumber;
    }


    //3. Write Only: setter method only
    private String internalLogs;

    //setter
    public void setInternalLogs(String logs){
        internalLogs=logs;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank holder = new Bank();
        holder.setBalance(4000);

        System.out.println(holder.getBalance());

        System.out.println(holder.getAccountNumber()); //null but suppose account number gets generated
    }
}
