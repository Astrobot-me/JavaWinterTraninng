import java.util.*;

class stackdemo {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>(); 
        st.push(12);
        st.push(13);
        st.push(13);
        st.push(16);
        st.push(17);

        // System.out.println(st);
        // System.out.println(st.pop());
        // System.out.println(st);

        // st.peek();
        // System.out.println(st.peek());
        // st.push(11); // Retuns top element
        System.out.println(st); //Last in First out
        System.out.println(st.search(8));
    }
}
