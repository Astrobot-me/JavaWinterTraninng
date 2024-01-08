import java.util.Scanner;

class Strdemo {
    
    String s="Hello World";

    public String toString(){
        return "Good Morning";
    }

    public String setUp(){
        // String s="Hello World";
        return s.toUpperCase();
    }
    public String setDn(){
        // String s="Hello World";
        return s.toLowerCase();
    }
    
    public String cvtToStr(int a){
        String y="";
        return y.valueOf(a);
    }
    
    public String index(String a){
        // String y="";
        return a.substring(2,6);
    }

    public String start_index(String a){
        // String y="";
        return a.substring(2);
    }
    
    public static void main(String arr[]){

        Strdemo st = new Strdemo();
        System.out.println(st);//Gives Garbage Value by default
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");

        String r = "";
        String v = "";
        int x=0;

        r = sc.nextLine();//whole line
        v = sc.next();//single word

        String output_format = "Hello "+r.toUpperCase()+ " , Hope you doing well !";
        System.out.println(output_format + " " + v);



        char array[] = r.toCharArray();
        // System.out.println(array);

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

        System.out.println("Found at "+ output_format.lastIndexOf(r.toUpperCase()));


        String x = st.setUp();
        String y = st.setDn();
        
        System.out.println(x);
        System.out.println(y);

        String z = st.cvtToStr(70044);
        System.out.println(z);

        String p = st.index("AdityaRaj");
        System.out.println(p);

        String q = st.start_index("AdityaRaj");
        System.out.println(q);
    }

}
