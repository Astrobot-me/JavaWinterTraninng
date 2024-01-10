

class runThread implements Runnable { //Inheriting the Thread Class
    

    public void run(){ //Running State
        try{
            for(int i=0;i<5;i++){
                System.out.println(i);
                Thread.sleep(2000);
            }
        }catch(Exception ae){
            System.out.println(ae);
        }
    }

    public static void main(String[] args) {
        runThread th = new runThread(); //New Stare
        Thread t = new Thread(th); //Runnable State
        t.start();
        
    }
}
