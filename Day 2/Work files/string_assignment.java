import java.util.Scanner;

class Str{

    char find(String a,int index){
        char array[] = a.toCharArray(); 
        char chr = 'a';
        for(int i=0;i<array.length;i++){
            if(i==index){
                chr = array[i];
            }
        }
        return chr;
    }
    public static void main(String[] args) {

        Str methods = new Str();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");
        String a = sc.nextLine();
        char b = methods.find(a, 5);
        System.out.println("This is found at index: "+b);

        System.out.println(a.equalsIgnoreCase("Hello"));
        // public boolean equalsIgnoreCase(java.lang.String);

        System.out.println(a.concat(" How are you? "));

    }
}
