import java.util.Scanner;

class Table {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Enter the Integer:");
        int number = sc.nextInt();
        System.out.println("Enter the last multiplier:");
        int last = sc.nextInt();
        System.out.println("Table of "+number);

        while(i<=last){
            System.out.println(number+" * "+i+" = "+number*i);
            i=i+1;
        }

    }
}
