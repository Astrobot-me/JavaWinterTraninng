
class overridedemo{

    void draw(int m){ //no of arguments, return type of method and type of arguments should be same
        
        System.out.println("Base Class draw method");

    }

}

class overridding extends overridedemo {//no of arguments, return type of method and type of arguments should be same

    void draw(int m){

        System.out.println("Child Class draw method");
    }
    
    
    
    public static void main(String[] args) {
        overridding ov = new overridding();
        ov.draw(0); 
    }
}
