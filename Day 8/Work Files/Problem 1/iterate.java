import java.util.*;

public class iterate  {
    public static void main(String arr[]){

        LinkedList<Integer> li = new LinkedList<Integer>();
        li.add(17);
        li.add(1);
        li.add(2);
        li.add(7);
        li.add(12);

        System.out.println(li);
        Iterator i = li.descendingIterator();

        while (i.hasNext()) {
            System.out.println(i.next());
            
        }
        


    }
}
