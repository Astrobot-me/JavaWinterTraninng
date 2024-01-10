class WTP {
    void printable(int x){ //use synchronized keyword
        synchronized(this){
            for(int i=1;i<=10;i++){
                System.out.println(i*x);
            }
        }
        System.out.println("Hello");
    }
}

class Thread1 extends Thread{
    WTP w = new WTP();
    public void run(){
        w.printable(2);
    }
}

class Thread2 extends Thread{
    WTP w = new WTP();
    public void run(){
        w.printable(3);
    }
}


public class Access extends Thread {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();

    }
}
