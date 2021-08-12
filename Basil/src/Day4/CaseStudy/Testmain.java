package Day4.CaseStudy;

public class Testmain {
    public static void main(String[] args) {
        Electronics e1 = new Electronics();
        e1.add("Mouse",4,false,30);
        e1.add("Laptop",4,true,50);
        e1.add("headset",5,false,19);
        e1.add("charger",0,false,30);

        Food f1 = new Food();
        f1.add("Banana",5,true,5);
        f1.add("tomato",5,false,10);
        f1.add("cherry",5,false,10);

        OnlineShop abc = new OnlineShop();
        System.out.println(abc.search("Electronics","Mouse",e1));
        System.out.println(abc.search("Food","casa",f1));

        System.out.println(abc.buy("basil","charger",e1));
        System.out.println(abc.buy("basil","headset",e1));
        e1.sort();


    }
}
