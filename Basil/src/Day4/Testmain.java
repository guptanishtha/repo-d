package Day4;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Testmain {

    public static void main(String[] args) {

        Waitinglist waitinglist = new Waitinglist();
        Basket fruitbasket = new Basket();

        fruitbasket.add("Banana",3);
        fruitbasket.add("Cherry",3);
        fruitbasket.add("mango",2);
        fruitbasket.add("pineapple",1);

        waitinglist.join_queue("raja");
        waitinglist.join_queue("rahul");
        waitinglist.display();

    }
}
