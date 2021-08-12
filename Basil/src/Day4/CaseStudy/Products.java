package Day4.CaseStudy;

import java.util.*;


public class Products {

    LinkedHashMap<String, ProductDetails> product = new LinkedHashMap<String, ProductDetails>();

    static final Comparator<Map.Entry<String, ProductDetails>> price_order;

    static {
        price_order = new Comparator<Map.Entry<String, ProductDetails>>(){
        @Override
        public int compare (Map.Entry < String, ProductDetails > a, Map.Entry < String, ProductDetails > b){
            return (int) Math.round(a.getValue().price - b.getValue().price);
        }};
    }

    public void add(String name, int stocks, boolean sale, double price) {
        ProductDetails info = new ProductDetails();

        if (sale) {
            info.price = (price) * 0.9;
        } else
            info.price = price;
        info.sale = sale;
        info.stocks = stocks;
        this.product.put(name, info);
    }

    public int search(String name) {
        if (this.product.containsKey(name)) {
            return 1;
        } else {
            return 0;
        }
    }

    public void sort() {
        List<Map.Entry<String, ProductDetails>> list
                = new ArrayList<Map.Entry<String, ProductDetails>>(
                this.product.entrySet());
        Collections.sort(list,price_order);

        for (Map.Entry<String, ProductDetails> l : list) {

            // Printing the sorted map
            // using getKey()  and getValue() methods
            System.out.println("Key ->"
                    + " " + l.getKey()
                    + ": Value ->"
                    + l.getValue().price);
        }

    }


}