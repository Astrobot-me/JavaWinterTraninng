

public class exceptdemo {
    public static void main(String[] args) {

        try{
        // int x = 30/0;
        // System.out.println(x); //arthemetic exception -java.lang.ArithmeticException
        
        String s = null;
        System.out.println(s.length()); //java.lang.NullPointerException
        
        String abc = "Hello";
        // String abc = "102";

        // int a = Integer.parseInt(abc); //java.lang.NumberFormatException: For input string: "Hello"
        // System.out.println(a);

        // int []arg = new int[5];

        // System.out.println(arg[5]); //java.lang.ArrayIndexOutOfBoundsException
        }
        catch(Exception n){
            System.out.println(n);
        }   
        // catch(ArithmeticException ae){

        //     System.out.println("Number divided by zero is not possible");
        // }
        // catch(NullPointerException np){
            
        //     System.out.println("Null String found");
        // }
        finally{
            System.out.println("Go");
        }

    }
}
