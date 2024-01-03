import java.util.Scanner;

class fibonacci {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Fibonacci number");
        int n = sc.nextInt();
        int a = 0, b = 1, c, i;
        System.out.println(" Fibonacci series");
        for (i = 3; i <= n; i++)
            
        {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}