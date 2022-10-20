//*Method:- functions that are written inside class are called methods */
class X {
    int i;

    public void show() { // method
        System.out.println(i);
        String name = "aman";
        System.out.println(name.charAt(0));
    }
}

public class Hello2 {
    public static void main(String[] args) {
        X obj = new X();
        obj.i = 5;
        obj.show();
    }
}
