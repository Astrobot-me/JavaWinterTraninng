
interface draw {

    public void draw(); //abstract method

    
} 


class Tri implements draw{


    public void draw(){
        System.out.println("Defined inside Triangle class");
    }

    public static void main(String[] args) {

        Triangle t = new Triangle();

        t.draw();
        // t.print();
        
    }

}
    

