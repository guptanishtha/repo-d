package Day4.CaseStudy;

import java.util.LinkedList;
import java.util.Queue;

public class OnlineShop<T extends Products> {

    Queue<String> waitinglist = new LinkedList<>();

    public String search(String Category, String name, T a) {
        if (Category.equals("Electronics")) {

            if (a.search(name) == 1) {
                return (name + " Found");
            }

            return (name + " Not Found");

        } else if (Category.equals("Food")) {
            if (a.search(name) == 1) {
                return (name + "Found");
            }
            return (name + "Not Found");

        } else {
            return (name + "Not Found");
        }
    }

    public String buy(String customername, String name, T a) {
        ProductDetails info = new ProductDetails();
        if (a.product.containsKey(name)) {
            info = a.product.get(name);
            if (info.stocks != 0) {
                if (info.sale) {
                    if (waitinglist.size() <= 5) {
                        waitinglist.add(customername);
                        return (name + " Added to queue");
                    } else {
                        return "Queue is exceeded limit";
                    }
                } else {
                    info.stocks -= 1;
                    a.product.put(name, info);
                    return (name + " Item Bought");
                }
            } else
                return (name + " Out of Stock");

        } else {
            return (name + " Not found");
        }
    }

    public void Confirmqueue() {
        waitinglist.remove();
    }
    }