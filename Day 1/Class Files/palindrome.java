import java.util.Scanner;

class Palindrome {
    int rev;
    int rem;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Palindrome data = new Palindrome();
        System.out.println("Enter an Integer: ");
        int num = sc.nextInt();
        int temp = num;

        while(num>0){
            data.rem=num%10;
            data.rev = data.rev*10+data.rem;
            num=num/10;
        }

        if(temp==data.rev){
            System.out.println(data.rev+" is a Palindrome");
        }else{
            System.out.println(data.rev+" is a Palindrome");
        }

    }
}
