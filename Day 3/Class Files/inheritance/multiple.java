interface n{

    void set(); // abstract method

}

class m{

    void get() {
        System.out.println("Hello World");
    }

}



class multipleinher extends m implements n{

    public void set(){
        System.out.println("Inherited from interface");
    } 

    public static void main(String[] args) {
        
        multipleinher h = new multipleinher();
        h.get();
        h.set();

    }
}