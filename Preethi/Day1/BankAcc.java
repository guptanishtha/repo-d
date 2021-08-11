package Day1;

public class BankAcc {
    private String customer;
    private int accNo;
    private double balance;
    private String email;
    private double phoneNo;


    // Constructor to initialise all 3 instance variables
    public BankAcc(String x, int a, double amount, String y, double no)
    {
        customer = x;
        accNo = a;
        balance = amount;
        email = y;
        phoneNo = no;

    }



    //To print the details
    public String printdetails(  ) {
        return ("Account name: " + this.customer + "\n" + " Account number: " + this.accNo + "\n" +
                " Available balance: " + "Rs." + this.balance + "\n" + "Email: " + this.email + "\n" + "Phone No: " + this.phoneNo + "\n");
    }

    //To deposit amount
    public void deposit(double amount) {
        if (amount <= 0) {

            System.out.println("Please enter a positive amount to deposit\n");
        }
        else {
            this.balance += amount;
            System.out.format("Rs.%.2f has been deposited into %s's account \n", amount, this.customer);
        }

    }


    //To withdraw amount
    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.format("Rs.%.2f has been withdrawn from %s's account\n", amount, this.customer);
        }
        else {
            System.out.println("Insufficient balance in " + this.customer + "'s account!\n");
        }

        //System.out.println("Available balance:" + balance);

    }
    public double getBalance() {
        return balance;
        // i want to print the convToString info whenever getBalance() is called.
    }
}
