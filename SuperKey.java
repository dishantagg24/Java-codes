//*The super keyword in Java is a reference variable which is used to refer immediate parent class object i.e. it acts as an object of parent class
//*super keyword is used if parent class and child class have same fields.
//*super can be used to invoke parent class method
//*super is used to invoke parent class constructor.

class X {
    public int i;

    X() {
        System.out.println("I m parent class constructor");
    }

    void show() {
        System.out.println("I m parent class method");
    }

}

class Y extends X {
    int i;

    Y() {
        // super(); //calling parent class constructor (always put in constructor & in
        // first line)
        System.out.println("I m derived class constructor");
    }

    Y(int a, int b) {
        super.i = a; // accessing parent class variable
        i = b;
    }

    void show() {
        System.out.println(super.i);
        super.show();
        System.out.println("I m derived class method");
        System.out.println(i);
    }
}

class SuperKey {
    public static void main(String[] args) {
        Y obj2 = new Y();
        Y obj = new Y(2, 3);
        obj.show();
    }
}