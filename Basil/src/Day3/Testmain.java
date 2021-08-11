package Day3;

import java.util.ArrayList;

public class Testmain {
    public static void main(String[] args){
        ArrayList<Cricket> c = new ArrayList<>();

        //Cricket
        Cricket c1 = new Cricket("sachin");
        Cricket c2 = new Cricket("dhoni");
        Cricket c3  = new Cricket("rahul");
        c.add(c1);
        c.add(c2);

        Generics<Cricket> abc = new Generics<>();
        abc.display(c);

        System.out.println("After Adding");
        abc.add(c,c3);
        abc.display(c);

        //Football
        System.out.println("\n");
        ArrayList<Football> f = new ArrayList<>();

        Football f1 = new Football("messi");
        Football f2 = new Football("ronaldo");
        Football f3 = new Football("benzema");
        f.add(f1);
        f.add(f2);

        Generics<Football> abd = new Generics<>();
        abd.display(f);
        System.out.println("After Adding");

        abd.add(f,f3);
        abd.display(f);


    }
}
