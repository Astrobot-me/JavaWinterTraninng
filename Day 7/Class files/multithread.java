
class multithread extends Thread {

    public void run(){
        // for(int j=2;j<=3;j++){
            try{
                for(int i=1;i<=10;i++){
                    System.out.println(2+ " x "+ i+" = "+(2*i));
                    System.out.println("3"+ " x "+ i+" = "+(3*i));
                    // Thread.sleep(1000);
                }
            }catch(Exception ae){

            }
        // }
    }

    public static void main(String[] args) {
        multithread mt = new multithread();
        // multithread mt2 = new multithread();

        mt.start();
    //     mt2.start();
    }
}
