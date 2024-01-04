import java.util.Scanner;

class Employee {
    public static void main(String args[]) {
        Employee data = new Employee();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the salary of Suresh:");
        int preTax_suresh=sc.nextInt();
        System.out.println("Enter the work Hours of Suresh:");
        int Hours_suresh=sc.nextInt();

        System.out.println("Enter the salary of Ram:");
        int preTax_Ram=sc.nextInt();
        System.out.println("Enter the work Hours of Ram:");
        int Hours_ram=sc.nextInt();

        float suresh = data.getPayment(preTax_suresh,Hours_suresh);
        float ram = data.getPayment(preTax_Ram,Hours_ram);

        System.out.println("Salary of Suresh Before Tax "+suresh+ " $");
        System.out.println("Salary of Ram Before Tax "+ram+ " $");

        System.out.println("\n"); 
       
        // System.out.println("Salary of Ram Before Tax "+ram);

        float payout_suresh = data.salary_tax(suresh);
        float payout_ram = data.salary_tax(ram);

        System.out.println("Tax Slab of Suresh:  "+data.tax_slab(suresh));
        System.out.println("Final Salary of Ram After Tax: " + payout_ram + " $");
        System.out.println("\n");


        System.out.println("Tax Slab of Ram: "+data.tax_slab(ram));
        System.out.println("Final Salary of Suresh: " + payout_suresh + " $");

    }

    public static int getPayment(int salary, int Hours) {

        return salary * Hours * 30;
    }

    public static float salary_tax(float payment) {

        if (payment <= 500) {
            // return payment;
        } else if (payment > 500 && payment <= 1000) {
            payment = payment - (payment/100)*10;
            // return payment;
        }else if (payment>1000){
            payment = payment - (payment/100)*30;
            // return payment;
        }
        return payment;
    }

    public static String tax_slab(float payment) {
        String slab = "";
        if (payment <= 60000) {
            slab =  "TAX EXEMPTED";
        } else if (payment > 60000 && payment <= 120000) {
            slab = "TAX IMPOSED OF 10% FLAT";
        }else if (payment>120000){
            slab = "TAX IMPOSED OF 30% FLAT";
        }
        return slab;
    }
}
