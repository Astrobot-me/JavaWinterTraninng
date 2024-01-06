

abstract class calculation {
    public float calculateArea(float r){
        float area;
        area = 3.14f*(r*r);
        return area;
    }
    public float calculatePerimeter(float r);
}

class circle extends calculation{
   
    public float calculateArea(float r) {
    //  float r = 2.4f;
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

}

// class Triangle extends calculation{
   
//     public float calculateArea(float l,float b) {
//     //  float l=7.9f, b=5.0f;
//      float area;
//      area = 0.5f*(l*b);
//      return area;  
//     }

//     public float calculatePerimeter(float a,float b,float c) {
//     //  float ab=7.9f, b=5.0f, c=6.7f;
//      float perimeter;
//      perimeter = a+b+c;
//      return perimeter; 
     
     
//     }

// }

class Main{

    public static void main(String[] args) {
        circle  c = new circle();

        // Triangle t = new Triangle();


        System.out.println(c.calculateArea(2.4f));
        System.out.println(c.calculatePerimeter(2.0f));
    }
}

