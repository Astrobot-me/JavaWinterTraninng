final class finalbase
{
   final int x=20;
   finalbase()
    {
          x=30;
         System.out.println(x);
    }
    final void get()
     {
        System.out.println("Final in base class");
     }
}
class finaldemo extends finalbase
{
     finaldemo()
      {
          super();
         
      }
     void get()
     {
         System.out.println("Final in derived class");
     }
   public static void main(String ar[])
     {
            finaldemo fd=new finaldemo();
            fd.get();
     }
}

