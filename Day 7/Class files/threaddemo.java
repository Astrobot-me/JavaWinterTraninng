

class Threaddemo extends Thread { //Inheriting the Thread Class
    

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
        Threaddemo th = new Threaddemo(); //New Stare
        
        th.start();
        
    }
}
