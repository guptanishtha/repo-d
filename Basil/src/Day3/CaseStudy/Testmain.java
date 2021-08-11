package Day3.CaseStudy;

import java.util.ArrayList;
import java.util.Map;

public class Testmain {
    public static void main(String[] args) {
        Electronics e1 = new Electronics("Mouse",4);
        e1.product.put("Laptop",4);
        e1.product.put("headset",5);
        e1.product.put("charger",0);

        Food f1 = new Food("Banana",5);
        f1.product.put("tomato",5);
        f1.product.put("cherry",5);

        OnlineShop abc = new OnlineShop();
        System.out.println(abc.search("Electronics","Mouse",e1));
        System.out.println(abc.search("Food","casa",f1));

        System.out.println(abc.buy("basil","charger",e1));
        System.out.println(abc.buy("basil","headset",e1));

    }
}
