// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    abstract void walk();

    // Regular method
    public void eat() {
        System.out.println("Animal eats");
    }
}

// Subclass (inherit from Animal)
class Horse extends Animal {
    public void walk() {
        // The body of animalSound() is provided here
        System.out.println("Horse walk");
    }
}

// Subclass (inherit from Animal)
class Chicken extends Animal {
    public void walk() {
        // The body of animalSound() is provided here
        System.out.println("Chicken walk");
    }
}

class Revision {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        h.eat();
    }
}