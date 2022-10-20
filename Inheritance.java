//* Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces, because the class can implement multiple interfaces. Note: To implement multiple interfaces, separate them with a comma (see example below). 
class A {
    int i;

    public void show() {
        System.out.println(i);
    }
}

class B {
    int j;

    public void show2() {
        System.out.println(j);
    }
}

class Test extends A {
    int k;

    public void show3() {
        System.out.println(k);
    }
}

public class Inheritance extends B {
    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
        obj.j = 1;
        obj.show2();
    }
}