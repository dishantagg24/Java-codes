//*In java we do not have to write destructor explicitly, Java includes automatic garbage collector which automatically delete unnecessary things like unused object, constructor, variable */
//*Constructor chaining:- when we called derived class constructor then first of all parent class's constructor will be execute then derived class constructor will execute */
public class Constructor {
    int age;
    String name;

    Constructor() {
        System.out.println("This is default Constructor");
    }

    Constructor(String n, int a) {
        this.age = a;
        this.name = n;
        System.out.println("This is parameterized Constructor");
    }

    Constructor(Constructor c2) {
        this.age = c2.age;
        this.name = c2.name;
        System.out.println("This is copy Constructor");
    }

    public void printInfo() {
        System.out.println("Student Name : " + this.name + "\nStudent Age : " + this.age);
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor();
        Constructor obj2 = new Constructor("Dishant", 22);
        obj2.printInfo();
        Constructor obj3 = new Constructor(obj2); // we didn't pass the properties for obj3 instead we passed the copy
                                                  // of obj2
        obj3.printInfo();
    }
}
