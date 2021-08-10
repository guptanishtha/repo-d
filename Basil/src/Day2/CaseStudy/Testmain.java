package Day2.CaseStudy;

import java.util.ArrayList;
import java.util.List;

public class Testmain {

    public static void main(String[] args) {
        Electronics e1 = new Electronics("Samsung", 3);
        Electronics e2 = new Electronics("iPHONE", 4);
        Clothing c1 = new Clothing("pants", 4);
        Clothing c2 = new Clothing("shirt", 4);


        List<Electronics> gadgets = new ArrayList<Electronics>();
        gadgets.add(e1);
        gadgets.add(e2);

        List<Clothing> clothes = new ArrayList<Clothing>();
        clothes.add(c1);
        clothes.add(c2);


        Onlineshop Target = new Onlineshop(clothes,gadgets);

        //Item1
        try {
            if (Target.search("Clothing", "towel").equals("Found")) {
                System.out.println("Item available");
            } else {
                throw new OutofStockException("Out of stock");
            }
        }
        catch (OutofStockException out)
        {
            System.out.println(out);
        }

        //Item2
        try {
            if (Target.search("Clothing", "shirt").equals("Found")) {
                System.out.println("Item available");
            } else {
                throw new OutofStockException("Out of stock");
            }
        }
        catch (OutofStockException out)
        {
            System.out.println(out);
        }

    }
}
