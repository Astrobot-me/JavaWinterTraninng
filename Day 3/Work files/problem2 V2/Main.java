

abstract class calculation {
    public float calculateArea(float r){
        float area;
        area = 3.14f*(r*r);
        return area;
    }
    public float calculatePerimeter(float r) {
    //  float r = 2.4f;
     float perimeter;
     perimeter = 2*3.14f*r;
     return perimeter;  
    }
    public float calculateArea(float l,float b) {
    //  float l=7.9f, b=5.0f;
     float area;
     area = 0.5f*(l*b);
     return area;  
    }
    public float calculatePerimeter(float a,float b,float c) {
    //  float ab=7.9f, b=5.0f, c=6.7f;
     float perimeter;
     perimeter = a+b+c;
     return perimeter; 
     
     
    }



}



class Main extends calculation{

    public static void main(String[] args) {
        Main m = new Main();

        System.out.println(m.calculateArea(4.6f));
        System.out.println(m.calculateArea(4.6f,4.0f));
        System.out.println(m.calculatePerimeter(9.6f));
        System.out.println(m.calculatePerimeter(4.6f,4.0f,6.4f));
    }
}

