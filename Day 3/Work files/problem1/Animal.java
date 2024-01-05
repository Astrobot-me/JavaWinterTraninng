// package Day 3.Work files.problem1;

abstract public class Animal {
    abstract void sound();
}

class Lion extends Animal{
    void sound() {
        System.out.println("Lion Makes sound");
    }
}
class Tiger extends Animal{
    void sound() {
        System.out.println("Tiger Makes sound");
    }
}

class Main{

    public static void main(String[] args) {
        Lion l = new Lion();
        Tiger t = new Tiger();


        l.sound();
        t.sound();
    }
}
