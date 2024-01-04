

class dtdemo {
        int x; // By defautl it takes zero 0
        String y; // by default it takes null
        boolean z; // by default it takes false

        void get(){
            System.out.println(x+" "+y+" "+z); 
            //we can access attributes directly in methods but in main method we have to make object of the class
        }

        void set(){
            x=1;
            y="Hello World";
            z=true;
            System.out.println(x+" "+y+" "+z);
        }

        public static void main(String[] args) {
            //we can access attributes directly in methods but in main method we have to make object of the class
            dtdemo demo = new dtdemo();
            demo.get();
            demo.set();
        }
}
