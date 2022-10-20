// Abstract class :- blueprint or imaginary class
abstract class Animal { // we can not make object of abstract class i.e. it cannot be instantiated
                        // it gives runtime error
    // Abstract method (does not have a body)
    abstract void animalSound(); // this means the animalSound method must be present in all its derived classes

    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}

class AbstractClass {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}