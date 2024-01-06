

class throwdemo {
    
    void get(int age) throws Exception
    {
        try{
            if(age<18){
                throw new Exception("Not eligible for Voting");
            }else{
                System.out.println("Eligible for voting");
            }

        }catch(Exception e){
            System.out.println(e);

        }
    }
    

    public static void main(String args[]){
        throwdemo t = new throwdemo();
        try{
            t.get(5);
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
