import java.util.*;

class List_Interface {
    
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("India");
        l.add("Nepal");
        l.add("USA");
        l.add("Pakistan");

        String arr[] = {"USA","Pakistan"};

        System.out.println(l);
        System.out.println(l.size());
        
        System.out.println(l.remove("Pakistan"));
        System.out.println(l.size());
        l.add(2,"West Indies");
        l.add(2,"Canada");

        System.out.println(l);
        System.out.println(l.get(3));

        System.out.println("Index od -->"+ l.indexOf("USA"));

        // l.sort(null);
        




    }
}
