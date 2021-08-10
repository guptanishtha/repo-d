package Day2.CaseStudy;

import Part2.Customer;

import java.util.List;
import java.util.stream.Collectors;

public class Onlineshop {
    private List<Clothing> Clothes;
    private List<Electronics> gadgets;

    public Onlineshop(List<Clothing> clothes, List<Electronics> gadgets) {
        this.Clothes = clothes;
        this.gadgets = gadgets;
    }


    public String search(String Category, String name) {
        if (Category.equals("Electronics")) {

            for (Electronics gadget : this.gadgets) {
                if (gadget.name.equals(name)) {
                    return "Found";
                }
            }
            return "Not Found";

        } else if (Category.equals("Clothing")) {
            for (Clothing cloth : this.Clothes) {
                if (cloth.name.equals(name)) {
                    return "Found";
                }
            }
            return "Not Found";

        }
        else
        {
            return "Not Found";
        }
    }
}