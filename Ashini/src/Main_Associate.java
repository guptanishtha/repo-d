public class Main_Associate {
    public static void main(String[] args) {
        BankAccount Customer1 = new BankAccount(12345678, 50, "Rahul", "rahul@something", 1234567);
        System.out.println(Customer1.getName());

        AssociateBank B1 = new AssociateBank("xyz", Customer1);
        B1.getAccountDetails().Deposit(100);
        B1.getAccountDetails().Withdrawal(200);


    }
}
