package calculation;

import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the integer:");
        a = sc.nextInt();
        factorial f = new factorial();
        f.factor(a);

        System.out.println("Enter the Number of Terms:");
        b = sc.nextInt();
        fibonacci fib = new fibonacci();
        fib.fibo(b);
    }

}
