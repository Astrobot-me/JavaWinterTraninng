import java.util.Scanner;

class Armstrong {
    int cube_sum;
    int digit;
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        Armstrong data = new Armstrong();
        System.out.println("Enter the Integer:");
        int num = sc.nextInt();
        int temp = num;

        while(num>0){
            data.digit=num%10;
            data.cube_sum = data.cube_sum+(data.digit*data.digit*data.digit);
            num=num/10;
        }

        if(temp==data.cube_sum){
            System.out.println(temp+ " is a Armstrong Number");
        }else{
            System.out.println(temp+ " is not a Armstrong Number");
        }


    }

}
