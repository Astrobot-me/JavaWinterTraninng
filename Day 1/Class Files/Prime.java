import java.util.Scanner;

class Prime {

    int flag = 0;
    int i;

 public static void main(String[] args) {
    Prime data = new Prime();
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Number");
    int num = sc.nextInt();

    for(data.i=2;data.i<=num;data.i++){
        if(num%data.i==0){
            System.out.println(num + " is not a prime");
            data.flag = 1;
            break;
        }
    }

    if(data.flag==0){
        System.out.println(num+ " is Prime Number");
    }

 }  
}
