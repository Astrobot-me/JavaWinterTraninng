

abstract public class Employee {
    abstract int calculateSalary(int h); 
    abstract void displayInfo(int age,String name,String role ); 
}

class Manager extends Employee{

    int calculateSalary(int h){
        return h*10;
    }

    void displayInfo(int age,String name,String role){
        System.out.println("Name of the Employee: " + name);
        System.out.println("Age of the Employee: " + age);
        System.out.println("Role of the Employee: " + role);
    }

}

class Programmer extends Employee{

    int calculateSalary(int h){
        return h*8;
    }

    void displayInfo(int age,String name,String role){
        System.out.println("Codie: " + name);
        System.out.println("Age: " + age);
        System.out.println("Programming Role : " + role);
    }

}

class Main{
    public static void main(String[] args) {
        Manager mukesh = new Manager();
        mukesh.displayInfo(23,"Mukesh","Assosiate Manager");
        System.out.println("Salary: "+ mukesh.calculateSalary(6)+ " $");

        Programmer Aditya = new Programmer();
        Aditya.calculateSalary(10);
        Aditya.displayInfo(20, "Aditya Raj", "Senior Developer");
        System.out.println("Salary: "+ Aditya.calculateSalary(10)+ " $");
    }
}

