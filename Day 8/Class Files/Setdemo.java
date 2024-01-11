import java.util.*;

class Setdemo { //No Duplicate Entries allowed
    
    public static void main(String[] args) {
        
        Set<Integer> s = new HashSet<Integer>();


        Stack<Integer> st = new Stack<Integer>(); 
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(6);
        st.push(7);

        Queue<Integer> q = new PriorityQueue<Integer>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        
        // s.add(12);
        // s.add(13);
        // s.add(16);
        // s.add(21);
        // s.add(24);
        // s.add(24);

        s.addAll(st);
        s.addAll(q);

        System.out.println(s);

    }
}
