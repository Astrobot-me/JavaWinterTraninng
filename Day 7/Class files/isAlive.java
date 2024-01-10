class isAlivedemo extends Thread{
    
    public void run(){
        System.out.println("Hi");
    }
    public static void main(String[] args) {
        isAlivedemo al = new isAlivedemo();

        System.out.println("Before Starting :"+ al.isAlive());
        al.start();
        System.out.println("During Run:"+ al.isAlive());
        // System.out.println("After Running:"+ al.isAlive());

    }
}
