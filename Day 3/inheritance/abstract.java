
abstract class draw {

    abstract void draw(); //abstract method

    void print(){
        System.out.println("from Non Abstract method");
        //Non- abstract method
    }
} 


class Triangle extends draw{


    void draw(){
        System.out.println("Defined inside Triangle class");
    }

    public static void main(String[] args) {

        Triangle t = new Triangle();

        t.draw();
        t.print();
        
    }

}
    

