//Exception is different from error. On receiving error java code immediately stops running but if we receive exception then it may be running further code if we used try-catch

public class ExceptionHandle {
    public static void main(String[] args) {
        int[] marks = { 98, 95, 89 };
        try {
            System.out.println(marks[5]);
        } catch (Exception exception) { // exception is an object of Exception class
            System.out.println("exception catch here");
        }
        System.out.println("aman");
    }
}
