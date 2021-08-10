package Day1;

public class TestMain {
    public static void main(String[] args) {

        BankAcc acc1 = new BankAcc("Preethi", 12345, 1000, "preethi@gmail.com", 911200);
        BankAcc acc2 = new BankAcc("Thanvi", 10741, 3500, "thanvi@gmail.com", 911355);
        BankAcc acc3 = new BankAcc("Latha", 11273, 7000, "latha@gmail.com", 65572);

        acc1.withdraw(1500);
        acc1.deposit(2300);
        acc2.withdraw(2000);
        acc2.deposit(200);
        acc3.withdraw(7000);

        System.out.println(acc1.printdetails());
        System.out.println(acc2.printdetails());
        System.out.println(acc3.printdetails());

        //Part2
        Bank bank1 = new Bank ("SBI", acc1);
        Bank bank2 = new Bank ("ICICI", acc2);
        Bank bank3 = new Bank ("HDFC", acc3);

        bank1.getAccount().deposit(4200);
        bank2.getAccount().withdraw(2200);
        bank3.getAccount().deposit(300);

        System.out.println(acc1.printdetails());
        System.out.println(acc2.printdetails());
        System.out.println(acc3.printdetails());

        System.out.println(bank1.tostring());
        System.out.println(bank2.tostring());
        System.out.println(bank2.tostring());






    }
}
