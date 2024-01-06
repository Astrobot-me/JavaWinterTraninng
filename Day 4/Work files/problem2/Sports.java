

class Sports {
    void play(String sports){
        System.out.println("Hello and Welcome to "+ sports);
    }
    void reward(String r){
        System.out.println("The Reward is: "+r);
    }   
}

class Football extends Sports{
    void play(){
        System.out.println("Hello and welcome to FIFA League");
    }
    
}
class Basketball extends Sports{
    void play(){
        System.out.println("Lets Watch Basketball");
    }
}
class Rugby extends Sports{
    void play(){
        System.out.println("Lets go play Rugby");
    }
}

class Main{
    public static void main(String[] args) {
        Football f = new Football();
        f.play();
        f.reward("Fifa Trophie");

        Basketball b = new Basketball();
        b.play();
        b.reward("10k $");

        Rugby r = new Rugby();
        r.play();
        r.reward("NOT Known");
    }
}
