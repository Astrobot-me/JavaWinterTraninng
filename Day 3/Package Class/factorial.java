package calculation;

import java.util.Scanner;

class factorial {
    int i=1;
    int fact=1;
    public void factor(int number) {
        
        // Scanner sc = new Scanner(System.in);
        

        // System.out.println("Enter the Integer:");
        int num = number;
        while(i<=num){
            fact=fact*i;
            i=i+1;
        }

        System.out.println("Factorial of the Given number is: ");
        System.out.println(fact);
    }
    public static void main(String[] args) {
        factorial data = new factorial();
        Scanner sc = new Scanner(System.in);
        int number = 5;
        System.out.println("Enter the integer:");
        number = sc.nextInt();
        // number = number != 0 ? number : 5;
        data.factor(number);
    }
    
}
