//*In C++, we need virtual keyword to achieve overriding or Run Time Polymorphism. In Java, methods are virtual by default.
//*In overloading there must be either different return type or different parameters */
//*Overloading is a compile time polymorphism */
class Test {
    public void show(int i) { // Method overridden
        System.out.println(i);
    }

    public void show(int i, int j) { // Method overloading
        System.out.println(i);
        System.out.println(j);
    }
}

class Test2 extends Test {
    public void show(int i) { // Method overriding
        System.out.println(i);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.show(0);
    }
}
