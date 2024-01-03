
class Employee {
    public static void main(String args[]) {
        Employee data = new Employee();

        float suresh = data.getPayment(100, 6);
        float ram = data.getPayment(200, 10);

        float payout_suresh = data.salary_tax(suresh);
        float payout_ram = data.salary_tax(ram);

        System.out.println("Final Salary of Ram: " + payout_ram);
        System.out.println("Final Salary of Suresh: " + payout_suresh);

    }

    public static int getPayment(int salary, int Hours) {

        return salary * Hours * 30 * 365;
    }

    public static float salary_tax(float payment) {

        if (payment <= 500) {
            return payment;
        } else if (payment > 500 && payment <= 1000) {
            payment = payment - (payment/100)*10;
            return payment;
        }else if (payment>1000){
            payment = payment - (payment/100)*30;
            return payment;
        }
    }
}
