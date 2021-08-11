package Day3.Inventory;

import java.util.ArrayList;

public class SearchAndBuy{

    ArrayList<Category> Category = new ArrayList<>();

    public void ProductBuy(String Cat, String Prod, int number) throws CustomException {
        boolean availability = false;
        for(int i = 0; i< Category.size(); i++){
            Category c1 = Category.get(i);
            if(c1.getCategoryName()==Cat && c1.product.containsKey(Prod)){
                availability = true;
                if(c1.getStock(Prod)>=number){
                    System.out.println("Your order has been placed.");
                    c1.product.put(Prod,c1.getStock(Prod)-number);
                }
                else
                    throw new CustomException("Product is out of stock.");

            }
        }
        //System.out.println(availability);
        if(!availability) {
            throw new CustomException("Product is not available.");
        }

    }
}
