

class bank {
    float rateofinterest(){

        return 8.5f; //include f at the end of num for flaot

    }
}

class sbi extends bank{

     //include f at the end of num for flaot

        void get(){

            System.out.println("Get in child class");
        }

    
    
    public static void main(String[] args) {
        
        bank b = new bank();//object of parent class
        sbi s = new sbi();//object of parent class
        System.out.println(s.rateofinterest());
        System.out.println(b.rateofinterest());
        s.get();

    }

}
