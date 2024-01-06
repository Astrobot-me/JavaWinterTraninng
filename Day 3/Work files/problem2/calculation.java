package p;

import p.Triangle;

abstract class calculation {
    public abstract float calculateArea(float r);
    public abstract float calculatePerimeter(float r);

    public abstract float calculateArea(float r,float b);
    public abstract float calculatePerimeter(float r, float b, float c);
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


class Main{

    public static void main(String[] args) {
        circle  c = new circle();

        Triangle t = new Triangle();


        System.out.println(c.calculateArea(2.4f));
        System.out.println(c.calculatePerimeter(2.0f));
    }
}
