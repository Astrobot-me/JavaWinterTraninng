import java.util.Scanner;

class Reverse {
    int rev;
    int rem;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Reverse data = new Reverse();
        System.out.println("Enter an Integer: ");
        int num = sc.nextInt();
        int temp = num;

        while(num>0){
            data.rem=num%10;
            data.rev = data.rev*10+data.rem;
            num=num/10;
        }

        System.out.println("Reverse of " + temp + " is :");
        System.out.println(data.rev);

    }

}
