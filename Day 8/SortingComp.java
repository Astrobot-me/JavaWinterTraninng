import java.util.*;


class student implements Comparable<student>{
    int age;
    String Name = "";

    student(String name,int age){
        this.age=age;
        this.Name=name;
    }

    public int compareTo(student st){
        
        if(age==st.age){
            return 0;
        }else if(age<=st.age){
            return -1;
        }else{
            return 1;
        }

    }


}

class comparedemo{
    

    public static void main(String[] args) {
        
        ArrayList<student> al = new ArrayList<student>();
        al.add(new student("Gooooruv",191));
        al.add(new student("Aditya",21));
        al.add(new student("Ram",20));
        al.add(new student("Ravi",200));


        for(student st:al){
            System.out.println(st.Name+" "+st.age);
        }
        System.out.println(al);

        Collections.sort(al);

        for(student st:al){
            System.out.println(st.Name+" "+st.age);
        }

    }

}





class SortComp  {
    
    public static void main(String[] args) {
        
        
        List<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(13);
        l.add(113);
        l.add(15);
        l.add(5);
        l.add(1);

       
        
    }


}
