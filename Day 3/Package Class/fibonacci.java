
package calculation;

import java.util.Scanner;
class fibonacci {
    
    int a = 0;
    int b = 1;
    int i;
    int c;
    public void fibo(int terms) {
        
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter Number of Terms");
        // int terms = sc.nextInt();
        System.out.println("Fibonacci upto "+terms+ " Terms");
        System.out.println(a);
        System.out.println(b);
        for(i=3;i<=terms;i++){
            c=a+b; 
            System.out.println(c);
            a=b;
            b=c;
        }

    }

        public static void main(String[] args) {
            fibonacci data = new fibonacci();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Number of Terms:");
            int terms = sc.nextInt();
            // terms = terms != 0 ? terms : 5;
            data.fibo(terms);
        }
    
}
