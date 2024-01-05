import java.util.Scanner;

class array {
    int [] a = new int[5];

    public static void main(String arr[]){
        array data = new array();
        Scanner sc = new Scanner(System.in);
        // int n;a

        for(int i=0;i<data.a.length;i++){
            System.out.println("Enter the integer");
            data.a[i] = sc.nextInt();
        }

        System.out.println("Elements of the Array are: ");
        for(int i=0;i<data.a.length;i++){
            System.out.println(data.a[i]);
            
        }
        
        System.out.println("Elements of the Array are from Foreach loop: ");
        for(int i:data.a){
            System.out.println(i);
        }
    }
}
