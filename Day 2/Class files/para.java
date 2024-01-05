import java.util.Scanner;

class Para {
    public static void main(String[] args) {
        String a = "";

        Scanner sc = new Scanner(System.in);

        a = sc.nextLine();

        while(sc.hasNext()){
            // a+=sc.next();
            String b = sc.nextLine();
            // System.out.println(b);
            String c = "br"; 
            if(b.equals(c)){
                break;
            }else{
                a = a +" "+ b;
                // System.out.println(a);
            }
        }

        System.out.println(a);
    }
}
