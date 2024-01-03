import java.util.Scanner;

class Fibonacci {
    
    int a = 0;
    int b = 1;
    int i;
    int c;
    public static void main(String[] args) {
        Fibonacci data = new Fibonacci();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Terms");
        int terms = sc.nextInt();
        System.out.println("Fibonacci upto "+terms+ " Terms");
        System.out.println(data.a);
        System.out.println(data.b);
        for(data.i=3;data.i<=terms;data.i++){
            data.c=data.a+data.b; 
            System.out.println(data.c);
            data.a=data.b;
            data.b=data.c;
        }
    }
}
