class Revstr {
    
    String rev(String word){
        char array[] = word.toCharArray();
        String reverse = "";
        for(int i=array.length-1;i>=0;i--){
            reverse = reverse+array[i];
        }
        return reverse;
    }
    public static void main(String[] args) {
        String a = "hello this is me";

        Revstr st = new Revstr();

        System.out.println(st.rev(a));
    }
}
