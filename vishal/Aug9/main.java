
public class main {
    public static void main(String[] args){
        Bank b1=new Bank(123,100,"Vishal","7vshal@gmail.com","1234");
        System.out.println(b1.getBalance());
        b1.deposit(30);
        System.out.println(b1.getBalance());
        b1.withdraw(100);
        System.out.println(b1.getBalance());
        b1.withdraw(100);

        //part 2
        customer c=new customer("vishal","7vshal@gmail.com","123");
        Bank2 n=new Bank2("Axis",123,500,c);
        System.out.println(n.getBalance());
        n.deposit(30);
        System.out.println(n.getBalance());
        n.withdraw(100);
        System.out.println(n.getBalance());
        n.withdraw(100);
    }
}
