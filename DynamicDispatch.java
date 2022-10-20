class A {

    void show() {
        System.out.println("I m A class's show function");
    }
}

class B extends A {
    void hello() {
        System.out.println("I m B class's hello function");
    }

    void show() {
        System.out.println("I m B class's show function");
    }
}

class C extends B {
    void hello() {
        System.out.println("I m C class's hello function");
    }

    void show() {
        System.out.println("I m C class's show function");
    }
}

class DynamicDispatch {
    public static void main(String[] args) {
        A objRef;
        A objA = new A();
        objRef = objA;
        objRef.show();
        B objB = new B();
        objRef = objB;
        objRef.show();
        // objRef.hello();
        // objB.hello();
    }
}