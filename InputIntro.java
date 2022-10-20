import java.util.Scanner;

public class InputIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner is a class for taking input & System.in as same as System.out
        int age = sc.nextInt();
        char ch = sc.next().charAt(0);
        String name = sc.next(); // it only takes tokens i.e. single word
        String sentence = sc.nextLine();
        System.out.println(age);
        System.out.println(ch);
        System.out.println(name);
        System.out.println(sentence);
        sc.close();
    }
}
