package Day4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Waitinglist {

    Queue <String> waiting;

    public Waitinglist()
    {
        this.waiting = new LinkedList<>();
    }

    public void join_queue(String name)
    {
        this.waiting.add(name);
    }

    public void give_fruit()
    {
        this.waiting.remove();

    }
    public void display()
    {
        Iterator it = this.waiting.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());

        }    }

}
