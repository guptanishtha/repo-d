public class AssociateBank {

    private String BankName;
    private BankAccount AccountDetails;

    public  AssociateBank(String BankName, BankAccount AccountDetails){
        this.BankName = BankName;
        this.AccountDetails = AccountDetails;
    }

    public void setBankName(String bankName) {
        this.BankName = bankName;
    }

    public String getBankName() {
        return BankName;
    }

    public void setAccountDetails(BankAccount accountDetails) {
        this.AccountDetails = accountDetails;
    }

    public BankAccount getAccountDetails() {
        return AccountDetails;
    }

}
