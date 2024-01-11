import java.util.*;

class Sort {
    
    public static void main(String[] args) {
        
        
        List<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(13);
        l.add(113);
        l.add(15);
        l.add(5);
        l.add(1);

        System.out.println("Before soting:");
        System.out.println(l);
        System.out.println("After soting:");
        // List<Integer> sorted = new ArrayList<Integer>();
        Collections.sort(l);
        System.out.println(l);

        System.out.println("After shuffling: ");
        Collections.shuffle(l);
        System.out.println(l);
        
        System.out.println("After reversing: ");
        Collections.reverse(l);
        System.out.println(l);

        // List list =  Collections.EMPTY_LIST;
        
        // Set<Integer> s = Collections.EMPTY_SET;
        // s.push(12);
        // s.push(1);
       
        

        // System.out.println("This is List: ");
        // System.out.println(s);
        
    }


}
