import java.util.Scanner;

class Sod {
    int sum;
    int digit;
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        Sod data = new Sod();
        System.out.println("Enter the Integer:");
        int num = sc.nextInt();
        int temp = num;

        while(num>0){
            data.digit=num%10;
            data.sum = data.sum+data.digit;
            num=num/10;

        }

            System.out.println("The Sum of the digits of "+temp+" is "+data.sum);
        


    }

}
