//*When we have to save memory and we have variables, methods that are common to objects then we can make those variales,methods static */

class student {
    String name;
    static String school; // school value is common for every student therefore we define it static
}

public class StaticKeyword {
    public static void main(String[] args) {
        student.school = "ABC"; // we can access static variables, methods using class name without making
                                // object
    }
}
