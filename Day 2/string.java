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
        r = sc.nextLine();
        System.out.println("Hello "+r.toUpperCase()+ " , Hope you doing well !");

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
