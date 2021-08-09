public class MainInter {

    public static void main(String[] args) {
        BankAccount Customer1 = new BankAccount(12345678, 50, "Rahul", "rahul@something", 1234567);
        System.out.println(Customer1.getName());
        System.out.println(Customer1.getBalance());
        Customer1.Deposit(500);
        Customer1.Withdrawal(700);
        Customer1.Deposit(100);
    }
}
