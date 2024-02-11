class Customer{
    String size = "";
    public static void main(String[] args) {
        int measurement = 3;
        Customer c1 = new Customer();
        switch(measurement){
            case 1: case 2 : case 3:
                c1.size = "S";
                break;
        }
        
        
    }
}