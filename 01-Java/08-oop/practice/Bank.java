import java.util.Random;

class Account{
    private String accountNumber;
    private long bankBalance;
    private String holderName;
    private int holderAge;

    //constructor: runs automatically when new account is created
    public Account(String holderName, int holderAge, long initialDeposit){
        //auto assign account number
        this.accountNumber=generateRandomAccountNumber();
        this.holderName=holderName;
        this.holderAge= holderAge;
        this.bankBalance=initialDeposit;
    }

    //methods
    // name: get only
    public String getHolderName(){
        return holderName;
    }

    //get age
    public int getHolderAge(){
        return holderAge;
    }
    //set age
    public void setHolderAge(int newAge){
        holderAge=newAge;
    }

    // account number: get only
    public String getAccountNumber(){
        return accountNumber;
    }

    // get bank balance
    public long getBankBalance(){
        return bankBalance;
    }

    //set bank balance
    public void setBankBalance(long ammount){
        bankBalance= bankBalance+ammount;
    }


    //Helpers
    private String generateRandomAccountNumber() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        
        // Generate a 10-digit random number
        for (int i = 0; i < 10; i++) {
            sb.append(random.nextInt(10)); // Appends a digit between 0 and 9
        }
        return sb.toString();
    }

}

public class Bank {
    public static void main(String[] args) {
        Account acc1 = new Account("Ankit Chaudhary", 23, 2300);

        System.out.println(acc1.getAccountNumber());
        
        System.out.println(acc1.getBankBalance());
        acc1.setBankBalance(700);

        System.out.println(acc1.getBankBalance());
        System.out.println(acc1.getHolderAge());
        
    }
}
