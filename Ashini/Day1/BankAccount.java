package Day1;

public class BankAccount {
    private double number;
    private double balance;
    private String name;
    private String email;
    private double phoneNo;

    // constructor
    public BankAccount(double number, double balance, String name, String email, double phoneNo){
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public  void setNumber(double number){
        this.number = number;
    }

    public double getNumber(){
        return  number;
    }

    public  void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return  balance;
    }

    public  void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public  void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return  email;
    }

    public  void setPhoneNo(double number){
        this.phoneNo = phoneNo;
    }

    public double getPhoneNo(){
        return  phoneNo;
    }

    public void Deposit(double DepositAmount) {
        this.balance += DepositAmount;
        System.out.println("Deposit of " + DepositAmount + " is made. New balance is " + this.balance);
    }

    public void Withdrawal(double WithdrawalAmount) {
        if(this.balance - WithdrawalAmount <= 0) {
            System.out.println("Withdrawal request amount: " + WithdrawalAmount +". Only " + this.balance + " is available. Withdrawal cannot be processed");
        } else {
            this.balance -= WithdrawalAmount;
            System.out.println("Withdrawal of " + WithdrawalAmount + " is processed. Remaining balance = " + this.balance);
        }
    }
}
