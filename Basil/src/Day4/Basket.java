package Day4;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    private Map<String, Integer> basket;

    public Basket()
    {
        this.basket = new HashMap<String, Integer>();
    }

    public String add(String name, int number) {
        if (this.basket.size() < 4)
        {
            if(number < 5) {
                this.basket.put(name, number);
                return "Added successfully";
            }
            else
            {
                return "Fruit exceed limit";
            }
        }
        else
        {
            return "Basket full";
        }
    }
}
