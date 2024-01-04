

class Staticdemo {
    
    // int c = 0;
    static int c = 0;
    Staticdemo(){
        c=c+1;
        System.out.println(c);
    }
    static{
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        Staticdemo s1 = new Staticdemo();
        Staticdemo s2 = new Staticdemo();
        Staticdemo s3 = new Staticdemo();
    }
}
