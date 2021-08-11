package Day2.Inventory;

public class MainClass {
    public static void main(String[] args) throws CustomException {
        Product cola = new Product("Beverages", "Cola", 15);
        Product pizza = new Product("Food", "Pizza", 20);

        cola.ProductBuy("Beverages","Cola",20);
        pizza.ProductBuy("Food","Pizza", 10);
    }
}