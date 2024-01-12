interface sub1 {

    void meth1();
    // void meth2();
}

class cl_sub implements sub1 {

    public void meth1(){
        System.out.println("hello hi");
    }

    void pr(){
        System.out.println("Hi");
    }
}


class inter extends cl_sub implements sub1{
    public void meth1(){
        System.out.println("hello");
    }
    public static void main(String arg[]){
        
        // cl_sub c = new sub1();
        sub1 b = new cl_sub();
        b.meth1();
    }

}