package Day1;

public class Bank {
    public BankAcc account;
    private String bankname;

    public Bank(String bankname, BankAcc account)
    {
        this.bankname = bankname;
        this.account = account;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public BankAcc getAccount() {
        return account;
    }

    public void setAccount(BankAcc account) {
        this.account = account;
    }

    public String tostring()
    {
        return("Bank: " + bankname + "\n" + "Account: " + account + "\n");
    }

}
