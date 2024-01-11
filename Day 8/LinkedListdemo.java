import java.util.*;

class LinkedListdemo {
    public static void main(String[] args) {
        

        LinkedList<Integer> ll = new LinkedList<Integer>();

        ll.add(30);
        ll.add(30);
        ll.add(3);
        ll.add(31);
        ll.add(32);
        ll.add(2,45);
        ll.add(2,45);
        ll.add(2,45);

        System.out.println(ll);
        System.out.println(ll.element());
        System.out.println(ll.size()); //Length
    }
}
