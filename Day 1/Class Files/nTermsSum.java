import java.util.Scanner;

class NtermsSum {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the first Term:");
        int number = sc.nextInt();
        System.out.println("Enter the last Term:");
        int last = sc.nextInt();
        // System.out.println("Sum of digits from "+number+ " to "+last);

        while(number<=last){
            sum = sum+number;
            ++number;
            
        }

         System.out.println("Sum of digits from "+number+ " to "+last+ " is " + sum);

    }
}
