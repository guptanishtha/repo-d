package Day3.Inventory;

public class MainClass {
    public static void main(String[] args) throws CustomException {
        Category Snacks = new Category("Snacks");
        Category Beverages = new Category("Beverages");
        Snacks.AddProduct("Chips",50);
        Snacks.AddProduct("Pizza", 20);
        Beverages.AddProduct("Pepsi", 40);
        Beverages.AddProduct("Mountain Dew", 15);


        SearchAndBuy s1 = new SearchAndBuy();
        s1.Category.add(Snacks);
        s1.Category.add(Beverages);
        s1.ProductBuy("Snacks","Pizza", 10);
        s1.ProductBuy("Snacks","Pasta",10);
        s1.ProductBuy("Beverages", "Pepsi", 50);


    }
}