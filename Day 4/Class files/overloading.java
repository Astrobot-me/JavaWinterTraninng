
class overloading {
    static float area(int r){
        return 3.14f*r*r;
    }

    static int area(int a,int b){
        return a*b;
    }

    public static void main(String[] args) {
        overloading ov = new overloading();
        System.out.println(area(3));//Static methods are directly called or from class name not from object name 
        System.out.println(overloading.area(2,6));//Static methods are directly called or from class name not from object name 
    }
}
