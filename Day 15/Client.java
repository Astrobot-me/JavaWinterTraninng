import java.net.*;
import java.util.Scanner;
import java.io.*;

class clientdemo {
   public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        try{
        Socket s =new Socket("localhost",3434);
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());


        ServerSocket ss = new ServerSocket(3434);

        Socket send = ss.accept();
        DataInputStream din = new DataInputStream(send.getInputStream());
        

        System.out.println("Write Messages:>");
        String message = sc.nextLine();

        while(sc.hasNext()){

            dout.writeUTF(message);
            dout.flush();


            String r = din.readUTF();
            System.out.println("Message Recieved: " + r);
            
            System.out.println("Write Messages:>");
            message = sc.nextLine();
            System.out.println("\n");
            
            

            if(message.equals("exit()") || message.equals(".exit")){
                System.out.println("Ending Conversation...");
                dout.writeUTF("Client 1 Left the chart");
                break;
            }

            
        }

        // dout.writeUTF("Hello ji ");
        // dout.writeInt(15);
        dout.flush();
        dout.close();
        s.close();
        }catch(Exception ax){
            System.out.println(ax);
        }
    }
}