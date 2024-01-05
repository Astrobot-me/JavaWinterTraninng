

class bank {
    float rateofinterest(){

        return 8.5f; //include f at the end of num for flaot

    }
}

class sbi extends bank{

     //include f at the end of num for flaot

        void get(){

            System.out.println("From SBI");
        }

}
    

class pnb extends sbi{  
    

    void set(){

        System.out.println("From PNB");
    }

    public static void main(String[] args) {
        
        // bank b = new bank();//object of parent class
        pnb p = new pnb();//object of parent class
        System.out.println(p.rateofinterest());
        p.get();
        p.set();

    }

}
