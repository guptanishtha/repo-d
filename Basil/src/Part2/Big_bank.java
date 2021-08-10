package Part2;

public class Big_bank {
    Customer c1;
    private int Account_number, balance;

    public Big_bank(int Account_number, int balance, String customer_name, String email, String phone_number) {
        this.Account_number = Account_number;
        this.balance = balance;
        c1 = new Customer(customer_name,email,phone_number);
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


    public void set_phone_number(String phone_number)
    {
        this.c1.set_phone_number(phone_number);
    }
    public String get_phone_number()
    {
        return this.c1.get_phone_number();
    }

    public String get_email()
    {
        return this.c1.get_email();
    }

    public int get_ac_number()
    {
        return this.Account_number;
    }

    public int get_balance()
    {
        return this.balance;
    }

}
