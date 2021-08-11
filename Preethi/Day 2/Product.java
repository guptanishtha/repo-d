package Day2;

public class Product extends Category {

    private String ProductName;
    private int Amount;

    //Constructor
    public Product (String cname, String pname, int n)
    {
        super(cname);
        this.ProductName = pname;
        this.Amount = n;
    }

    //Setters and Getters
    public void setPName (String pname)
    {
        this.ProductName = pname;
    }

    public void setAmount (int a)
    {
        this.Amount = a;
    }

    public String getPName()
    {
        return ProductName;
    }

    public int getAmount()
    {
        return Amount;
    }


    //Purchasing Function
    public void Buy(String C, String P, int n) throws OutofStockException
    {
        if (super.getCName()==C && getPName()==P && getAmount()>=n)
        {
            this.Amount -= n;
            System.out.println(P + " under category " + C + " is bought\n");
        }
        else
            throw new OutofStockException("The product " + P + " under category " + C + " is out of stock!\n");
    }

}
