/*We can achieve ABSTRACTION in JAVA by 2 types
    1. Abstract classes
    2. Interfaces

    ques :- Why we need of INTERFACES when we have Abstract Classes in Java?
    ans :- Because we want these properties-
        i). Multiple Inheritence
        ii). 100 % Abstraction
*/

abstract class Figure {// abstract class
    double dim1, dim2; // we can not achieve 100 % abstraction here (Because we don't define these
                       // variables with Abstract Keyword)

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();// abstract method

}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.print("Rectangle : ");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.print("Triangle : ");
        return dim1 * dim2 / 2;
    }
}

// Another Abstract Class Example

abstract class Animal {
    abstract void eat();

    Animal() {
        System.out.println("Animal Constructor");// whenever this class child create object then "the parent class
                                                 // constructor called first" then child class constructor called
    }

    void breathe() {
        System.out.println("All Animals can breathe.");
    }
}

class Dog extends Animal {// for Dog class it is compulsory write those methods which are abstract in the
                          // parent abstract class
    Dog() {
        // super(); // Java create this line by default if we don't specify then the
        // constructor heirearchy work.
        System.out.println("Dog class constructor.");// dog class constructor called after the parent class constructor
                                                     // called
    }

    void eat() {
        System.out.println("Dog can eat");
    }
}

// ABSTRACTION WITH `INTERFACES`

interface Animal2 {
    void eat(); // by default these methods are public,static

    void breathe();
}

class Dog2 implements Animal2 {
    public void eat() {
        System.out.println("Dog2 can eat");
    }

    public void breathe() {
        System.out.println("Dog2 can breathe.");
    }
}

public class AbstractMethod {
    public static void main(String[] args) {
        // Figure f = new Figure(5,6);

        // Rectangle r = new Rectangle(5, 6);
        // Triangle t = new Triangle(30, 5);

        // Figure figref;

        // figref = r;
        // System.out.println("Rectangle " + figref.area());
        // figref = t;
        // System.out.println("Triangle " + figref.area());
        // System.out.println("Rectangle " + r.area());
        // System.out.println("Rectangle " + t.area());

        /*
         * whenever we run this single line we can check, which class constructor called
         * first (obyously Parent class) how this is work? Whenever this line run
         * java
         * creates a super() keyword by default next to the dog constructor print
         * line
         */
        Dog dog = new Dog();
        dog.eat();
        dog.breathe();

        Dog2 dog2 = new Dog2();
        dog2.breathe();
    }
}
