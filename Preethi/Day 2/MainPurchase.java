package Day2;

public class MainPurchase {

    public static void main (String args[]) throws OutofStockException
    {
        Product p1 = new Product("Groceries", "Soap", 5);
        Product p2 = new Product("Electronics", "HeadPhones", 2);

        p1.Buy("Groceries", "Soap", 3);
        p2.Buy("Electronics", "HeadPhones", 5);
    }
}
