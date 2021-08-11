package Day3.CaseStudy;

import jdk.jfr.Category;

import java.util.HashMap;
import java.util.Map;


public class Products {
    HashMap<String ,Integer> product = new HashMap<String, Integer>();
    public Products(String name,int stocks )
    {
     this.product.put(name,stocks);
    }

    public int search(String name)
    {
        if(this.product.containsKey(name))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }


}