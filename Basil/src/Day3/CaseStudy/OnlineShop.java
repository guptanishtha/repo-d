package Day3.CaseStudy;

import Day3.CaseStudy.Electronics;
import Day3.CaseStudy.Food;

import java.util.*;

public class OnlineShop<T extends Products>{

    Queue<String> waitinglist = new LinkedList<>();

    public String search(String Category, String name, T a) {
        if (Category.equals("Electronics")) {

            if (a.search(name) == 1) {
                return "Found";
            }

            return "Not Found";

        } else if (Category.equals("Food")) {
            if (a.search(name) == 1) {
                return "Found";
            }
            return "Not Found";

        } else {
            return "Not Found";
        }
    }

    public String buy(String customername, String name, T a)
    {
        if(a.product.containsKey(name))
        {
            if(a.product.get(name)!=0) {
                if(waitinglist.size() <=5)
                {waitinglist.add(customername);
                    a.product.put(name, a.product.get(name) - 1);
                return "Added to queue";}
                else
                {
                    return "Queue is exceeded limit";
                }
            }

            else
                return "Out of Stock";

        }
        else
        {
            return "Not found";
        }
    }

    public void Confirmqueue()
    {
        waitinglist.remove();

    }
}