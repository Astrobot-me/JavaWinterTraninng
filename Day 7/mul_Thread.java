
class multi extends Thread {

    public void run(){
        
            try{
                System.out.println("Hi");
            }catch(Exception ae){

            }
        
    }

    public static void main(String[] args) {
        multi mt = new multi();
        multi mt2 = new multi();

        mt.start();
        mt2.start();
    }
}
