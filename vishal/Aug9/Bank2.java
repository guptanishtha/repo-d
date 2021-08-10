public class Bank2 {
    private customer c;
    private String bankname;
    private int accountNumber;
    private int balance;

    Bank2(String bankname,int accountNumber,int balance,customer c){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.bankname=bankname;
        this.c=c;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }


    public void deposit(int amt){
        this.balance+=amt;
    }
    public void withdraw(int amt){
        if(this.balance<amt){
            System.out.println("Insufficient balance");
        }
        else{
            this.balance-=amt;
        }
    }
}
