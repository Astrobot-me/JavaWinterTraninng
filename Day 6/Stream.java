import java.io.*;


public class Stream {

    public static void main(String[] args) {
        Stream s = new Stream();
        try{
            int a = System.in.read();
            System.out.println((char)a);
        }catch(Exception ae){
            System.out.println(ae);
        }
    }
        
}
