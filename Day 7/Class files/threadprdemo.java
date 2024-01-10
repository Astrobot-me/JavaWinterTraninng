// package Day 7;

class threadprdemo extends Thread{

    threadprdemo(String a){
        super(a);
        // System.out.println(pri.getName());
         // runs thread class constructor
    }
    
    public static void main(String[] args) {
        threadprdemo pri = new threadprdemo("Gaurav"); // Const is required in parameterized
        threadprdemo pri2 = new threadprdemo("RIT");
        // Thread th = new Thread(pri);
        System.out.println(Thread.currentThread().getName());
        System.out.println(pri.getName());
        System.out.println(pri2.getName());
        pri2.setPriority(7);
        System.out.println(pri.getPriority());
        System.out.println(pri2.getPriority());
    }
}
