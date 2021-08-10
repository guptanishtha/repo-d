package Part1;

//Part 1:
//
//	     Create a new class for a bank account
//         Create fields for the account number, balance, customer name, email and phone number.
//
//         Create getters and setters for each field
//         Create two additional methods
//         1. To allow the customer to deposit funds (this should increment the balance field).
//         2. To allow the customer to withdraw funds. This should deduct from the balance field,
//         but not allow the withdrawal to complete if their are insufficient funds.
//         You will want to create various code in the TestMain class (the one created by IntelliJ) to
//         confirm your code is working.
//         Add some System.out.println's in the two methods above as well.
//
//         Part 2:
//
//         Add one bank associated with the customer use bank class and customer as its instance member class then
//         create above withdraw and deposit functionality.
public class Bank {
    private int Account_number, balance;
    private String customer_name, email, phone_number;

    public Bank(int Account_number, int balance, String customer_name, String email, String phone_number) {
        this.Account_number = Account_number;
        this.balance = balance;
        this.customer_name = customer_name;
        this.email = email;
        this.phone_number = phone_number;
    }

    public void Deposit(int amount)
    {
        this.balance += amount;
        System.out.println("The current balance : "+ this.balance);
    }

    public void Withdrawal(int amount)
    {
        if(this.balance - amount <= 0)
        {
            System.out.println("The balance is not sufficient");
        }
        else
        {
            this.balance -= amount;
            System.out.println("The current balance : "+ this.balance);
        }
    }
    public void set_name(String name)
    {
        this.customer_name = name;
    }
    public String get_name()
    {
        return this.customer_name;
    }

    public void set_email(String email)
    {
        this.email = email;
    }
    public String get_email()
    {
        return this.email;
    }

    public void set_ac_number(int ac_number)
    {
        this.Account_number = ac_number;
    }

    public int get_ac_number()
    {
        return this.Account_number;
    }

    public int get_balance()
    {
        return this.balance;
    }

    public void set_phone_number(String phone_number)
    {
        this.phone_number = phone_number;
    }
    public String get_phone_number()
    {
        return this.phone_number;
    }
}
