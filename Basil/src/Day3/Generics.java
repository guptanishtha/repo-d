package Day3;

import java.util.ArrayList;

public class Generics <T extends Player>  {

   public void display (ArrayList<T> a){
       for (T b: a)
       {
           System.out.println(b.getname());
       }
   }

   public void add(ArrayList<T> a, T b)
   {
       a.add(b);
   }
}
