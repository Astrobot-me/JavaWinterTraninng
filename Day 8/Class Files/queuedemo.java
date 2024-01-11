import java.util.*;

class queuedemo {
    public static void main(String[] args) {
        
        Queue<Integer> q = new PriorityQueue<Integer>();
        Queue<String> qs = new PriorityQueue<String>();

        q.add(13);
        q.add(19);
        q.add(21);
        q.add(33);
        q.add(38);

        qs.add("India");
        qs.add("USA");
        qs.add("Mexico");
        qs.add("Japan");
        qs.add("Columbia");

        System.out.println(q);
        System.out.println(q.poll()); //returns Head Element
        System.out.println(q.peek());
        
        
        System.out.println(qs);
        // System.out.println(qs.poll());
        // System.out.println(qs.peek());
        
        for (String i: qs) {
            System.out.println(i);
            
        }
        


    }    
}
