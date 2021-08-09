package Part1;

public class Part1 {
    public static void main(String[] args)
    {
        Bank b1 = new Bank(1234, 100,"basil",
                "1234@email.com","+0213123");

        System.out.println(b1.get_ac_number());
        System.out.println(b1.get_email());

        b1.Withdrawal(20);

        b1.Withdrawal(80);
        b1.Deposit(100);

        System.out.println(b1.get_balance());

    }
}
