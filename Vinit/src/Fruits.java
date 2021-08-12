import java.util.*;

public class Fruits {
    public static void main(String[] args) {
        Queue<Integer> myBasket = new LinkedList<>();  // types of fruits are fruit 0, fruit 1, fruit 2
        int typeOfFruit[] = {0,0,0,0};
        int maxCap = 20;
        Random r = new Random();

        while(myBasket.size()<maxCap)
        {
            int type = r.nextInt(4);
            if(typeOfFruit[type]<5)
            {
                myBasket.add(type);
                typeOfFruit[type]++;
            }
        }

        ArrayList<Integer> child1 = new ArrayList<>();
        ArrayList<Integer> child2 = new ArrayList<>();
        ArrayList<Integer> child3 = new ArrayList<>();

        while(myBasket.isEmpty()==false)
        {
            if(myBasket.isEmpty()==false)
                child1.add(myBasket.poll());
            if(myBasket.isEmpty()==false)
                child2.add(myBasket.poll());
            if(myBasket.isEmpty()==false)
                child3.add(myBasket.poll());
        }

        System.out.println("Child 1 got fruits : "+child1);
        System.out.println("Child 2 got fruits : "+child2);
        System.out.println("Child 3 got fruits : "+child3);
    }
}
