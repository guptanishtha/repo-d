//Part 1:
//
//        Create a new class for a bank account
//        Create fields for the account number, balance, customer name, email and phone number.
//
//        Create getters and setters for each field
//        Create two additional methods
//        1. To allow the customer to deposit funds (this should increment the balance field).
//        2. To allow the customer to withdraw funds. This should deduct from the balance field,
//        but not allow the withdrawal to complete if their are insufficient funds.
//        You will want to create various code in the TestMain class (the one created by IntelliJ) to
//        confirm your code is working.
//        Add some System.out.println's in the two methods above as well.
//
//        Part 2:
//
//        Add one bank associated with the customer use bank class and customer as its instance member class then
//         create above withdraw and deposit functionality.
public class Bank {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    Bank(int accountNumber,int balance,String customerName,String email,String phoneNumber){
        this.balance=balance;
        this.accountNumber=accountNumber;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
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
