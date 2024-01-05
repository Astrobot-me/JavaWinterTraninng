

abstract class BankAccount {
    abstract void deposit(int i);
    abstract void withdraw(int i);
}

class SavingAccount extends BankAccount{
    void deposit(int balance){
        if(balance < 1000){
            System.out.println("Account is NOT Opened, MINBAL:1000");
        }else{
            System.out.println("Account is Opened,Thanks for choosing us");
        }
    }

    void withdraw(int balance){
        if(balance > 1000){
            System.out.println("MAX WITHDRAW 1000 or less ");
        }else{
            System.out.println("BAL DISPENSED");
        }
    }
}

class CurrentAccount extends BankAccount{
    void deposit(int balance){
        if(balance < 10000){
            System.out.println("ACC NOT OPENED, MINBAL:10000");
        }else{
            System.out.println("Account is Opened,Thanks for choosing us as  Prefered Banking Partner");
        }
    }

    void withdraw(int balance){
        if(balance > 2000){
            System.out.println("MAX WITHDRAW 2000 or less ");
        }else{
            System.out.println("BAL DISPENSED");
        }
    }
}

class Main{

    public static void main(String[] args) {
        CurrentAccount fma = new CurrentAccount();
        fma.deposit(800);
        fma.withdraw(100);

        SavingAccount ram = new SavingAccount();
        ram.deposit(1000);
        ram.withdraw(2000);
    }
}