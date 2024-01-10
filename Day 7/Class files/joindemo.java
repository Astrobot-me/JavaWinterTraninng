
class joindemo extends Thread {


    public void run(){
        try{
            
            for(int i=0;i<5;i++){
                System.out.println(i);
                // 
                // Thread.sleep(3000);
            }

        }catch(Exception ae){

            System.out.println(ae);
        }

    }
    public static void main(String[] args) {
        joindemo jd = new joindemo();
        joindemo jd2 = new joindemo();
        joindemo jd3 = new joindemo();

        jd.start();
        try{
            System.out.println(Thread.currentThread().getName());
            jd.join();
        }catch(Exception ae){

        }
        // jd.start();
        jd2.start();

        try{
            System.out.println(Thread.currentThread().getName());
            jd2.join();
        }catch(Exception ae){

        }

        jd3.start();
        System.out.println(Thread.currentThread().getName());



    }
    
}
