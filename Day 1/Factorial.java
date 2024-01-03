import java.util.Scanner;


class Factorial {
    
    int i=1;
    int fact=1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factorial data = new Factorial();

        System.out.println("Enter the Integer:");
        int num = sc.nextInt();
        while(data.i<=num){
            data.fact=data.fact*data.i;
            data.i=data.i+1;
        }

        System.out.println("Factorial of the Given number is: ");
        System.out.println(data.fact);
    }
}
