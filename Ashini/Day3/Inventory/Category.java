package Day3.Inventory;

import java.util.HashMap;
import java.util.Map;

public class Category {
    String CategoryName;

    public Category(String name){
        this.CategoryName = name;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    Map<String, Integer> product = new HashMap<>();

    public void AddProduct(String prodName, int stock){
        product.put(prodName,stock);
    }

    public int getStock(String prodName){
        return product.get(prodName);
    }

}
