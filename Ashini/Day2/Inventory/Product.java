package Day2.Inventory;

public class Product extends Category{
    private String ProdName;
    private int Stock;

    public Product (String CategoryName, String name, int number){
        super(CategoryName);
        this.ProdName = name;
        this.Stock = number;
    }

    public void setProdName(String prodName) {
        this.ProdName = prodName;
    }

    public String getProdName() {
        return ProdName;
    }

    public void setStock(int stock) {
        this.Stock = stock;
    }

    public int getStock() {
        return Stock;
    }

    public void ProductBuy(String Category, String Product, int number) throws CustomException{
        if(super.getCategoryName()== Category && getProdName() == Product && getStock()>= number){
            this.Stock -= number;
            System.out.println("Product Bought");
        }
        else
            throw new CustomException("Product Out of stock");

    }
}
