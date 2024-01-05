
package r;

import q.third;//import will be second and package will be first

public class fourth {

    public void set(){
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        third th = new third();
        fourth fh = new fourth();

        th.get();
        fh.set();

    }
    
}
