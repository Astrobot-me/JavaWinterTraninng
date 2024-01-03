import java.util.Scanner;

class scandemo{
    int var = 100;
    public static void main(String args[]) {
        scandemo data = new scandemo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Integer");
        // int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("Enter a Integer");
        // int b = sc.nextInt();
        float b = sc.nextFloat();
        // int c = (a+b)*100;
        float c = ((a+b)*1000)/2;
        System.out.println(c);
        System.out.println(data.var);
        }

}