// package assignment4;

class Animal {
    void Sound(String sound){

        System.out.println("This Animal makes  "+sound+" Sound");

    }
}

class Bird extends Animal{
    
    void bird(){
        System.out.println("Hello I'm a Bird");
    } 

}
class Cat extends Animal{
    
    void cat(){
        System.out.println("Hello I'm a Cat");
    } 

}

class Main{
    public static void main(String[] args) {
        Bird b = new Bird();
        b.Sound("chirupping");
        b.bird();

        Cat c = new Cat();
        c.Sound("Meow Meow");
        c.cat(); 
    }
}