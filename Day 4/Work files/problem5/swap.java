class Swap {
    int a,b;
    void swap(int a,int b){
        int t;
        this.a=b;
        this.b=a;
        t=a;

    }
}

class Main{


    public static void main(String[] args) {
        Swap s = new Swap();
        int a = 15;
        int b = 16;

        System.out.println(a+"  "+b);
        s.swap(a, b);
        System.out.println(a+"  "+b);
    }
}
