import java.net.*;
import java.io.*;
class Server
{
   public static void main(String args[])
{
  try
  {
   ServerSocket ss=new ServerSocket(3434);
   Socket s=ss.accept();

   DataInputStream din=new DataInputStream(s.getInputStream());

   String str=din.readUTF();
   int num = din.readInt();
   
   System.out.println("Message ::"+str);
   System.out.println("Number ::"+num);
   s.close();
   }
    catch(Exception ax)
    {
      System.out.println(ax);
    }
}
}