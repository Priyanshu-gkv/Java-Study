// Herierchial Inheritence
// Java dosen't allow multiple inheritence (IF IT IS ALLOW THEN IN THE FORM OF INTERFACE)
// It's Multilevel Inheritence

class Animal {
    void eat() {
        System.out.println("Animal can eat.");
    }

    void breathe() {
        System.out.println("Animal can breathe.");
    }

    void sleep() {
        System.out.println("All animals can sleep.");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("Fish can swim");
    }

    void fins() {
        System.out.println("Fish have fins to swim.");
    }
}

class Shark extends Fish {
    void size() {
        System.out.println("Shark has bigger size than others.");
    }
}

class Tuna extends Fish {
    void size() {
        System.out.println("Tuna has smaller size than Shark.");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("All birds can fly.");
    }

    void legs() {
        System.out.println("All birds have 2 legs.");
    }
}

class Crow extends Bird {
    void sound() {
        System.out.println("Crow crow..");
    }
}

class Peacock extends Bird {
    void sound() {
        System.out.println("tiaau tiaau..");
    }
}

class Mammals extends Animal {
    void species() {
        System.out.println("Mammals have different types of species (like human, lion, fox.....etc.");
    }
}

class Human extends Mammals {
    void legs() {
        System.out.println("Humans have 2 legs.");
    }

    @Override
    void breathe() { // Inheritence From Animal class (MULTILEVEL INHERITENCE)
        System.out.println("Humans can breathe.");
    }
}

class Lion extends Mammals {
    void legs() {
        System.out.println("Lion have 4 legs.");
    }
}

// class MultipleInheritence extends Animal,Mammals{// Multiple inheritence not
// supprted by java 'WITH CLASSES'

// void property() {
// System.out.println("Never run have error");
// }
// }

// MULTIPLE INHERITENCE

interface Animal2 {
    void eat();
}

// Herbirore Means those animals who eat grass.
interface Herbivore extends Animal2 { // interface inheritence
    void eatGrass();
}

// those animals who eat meat.
interface Carnivore extends Animal2 { // interface inheritence
    void eatMeat();
}

class Bear implements Herbivore, Carnivore { // multiple inheritence
    public void eatGrass() {
        System.out.print("Bear eat grass ");
    }

    public void eatMeat() {
        System.out.println("As well as meat.");
    }

    public void eat() {
        System.out.println("This is eat method which is inherited from Parent Interface.");
    }
}

public class Inheritence {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Human human = new Human();
        Animal animal = new Animal();
        Bird bird = new Bird();
        Crow crow = new Crow();

        lion.eat();
        human.breathe();
        crow.sleep();
        crow.sound();

        Bear bear = new Bear();
        bear.eatGrass();
        bear.eatMeat();
    }
}
