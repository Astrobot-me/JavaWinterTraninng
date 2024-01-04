

class Constructor {
    int a;
    int b;
    Constructor(){
        this(15,16);// Calls to Parameterized constructor
        System.out.println("Default Constructor");
    }
    Constructor(int a,int b){

        // this(); // Calls to Default constructor
        this.a=a;
        this.b=b;
        System.out.println("Parameterized Constructor : "+(this.a+this.b));
    }
    public static void main(String[] args) {
        // Constructor c = new Constructor();//Default Constructor used
        Constructor d = new Constructor(); // Parameterized Constructor used
    }
}
