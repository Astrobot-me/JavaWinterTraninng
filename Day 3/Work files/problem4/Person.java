
abstract class Person {
    abstract void eat(int c);

    abstract void exercise(int h);
}

class athelete extends Person {

    void eat(int calorie){
        if(calorie<200){
            System.out.println("More Calorie Required");
        }else{
            System.out.println("Perfect Meal");
        }
    }

    void exercise(int hours) {
        if (hours < 3) {
            System.out.println("More Exercise Required");
        } else {
            System.out.println("Proper Way of Living");
        }
    }
}

class LazyPerson extends Person {

    void eat(int calorie) {
        if (calorie < 100) {
            System.out.println("More Calorie Required");
        } else {
            System.out.println("Perfect Day");
        }
    }

    void exercise(int hours) {
        if (hours < 2) {
            System.out.println("More Exercise Required");
        } else {
            System.out.println("Proper Way of Living");
        }
    }
}

class Main {

    public static void main(String[] args) {
        athelete a = new athelete();
        a.eat(300);
        a.exercise(5);

        LazyPerson p = new LazyPerson();
        p.eat(100);
        p.exercise(1);
    }
}
