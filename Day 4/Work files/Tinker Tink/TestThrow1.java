// import java.io.IOError;
import java.io.IOException;

public class TestThrow1{   
    //function to check if person is eligible to vote or not   
    public static void validate(int age)throws IOException  {  
        if(age<18) {  
            //throw Arithmetic exception if not eligible to vote  
            throw new RuntimeException("Person is not eligible to vote");    
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
            throw new IOException("Message");
        }  
    }  
    //main method  
    public static void main(String args[]){  
        //calling the function  
        // try{
        //     TestThrow1.validate(21);
        // }
        // catch(Exception q){
        //         System.err.println(q);
        //         // q.printStackTrace();
        //     }
        TestThrow1.validate(21);
        System.out.println("rest of the code...");    
  }    
}    