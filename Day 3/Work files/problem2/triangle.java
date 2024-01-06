package p;

import p.calculation;

public class Triangle extends calculation{
   
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

