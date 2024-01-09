import java.io.*;

public class File_write {


    public static void main(String[] args) {
        File_write f = new File_write();
        try{
            FileOutputStream fos = new FileOutputStream("textdoc.txt");
           
            String s  = "Welcome to  RIT";
            byte c[] = s.getBytes();

            // for(int i=0;i<c.length;i++){
            //     fos.write(c[i]);
            // }
            
            fos.write(c);
            fos.close();

            FileInputStream fis = new FileInputStream("hello.txt");
            String b="";
            int a =0 ;

            a=fis.read();
            while(a!=-1){ //-1 indicates End of file
                // char z;
                
                // b = (char)a + b;
                System.out.print((char)a);
                a=fis.read();
            }    
            //System.out.println(b);

            fis.close();
           
        }catch(Exception ae){

        }
    }
}
