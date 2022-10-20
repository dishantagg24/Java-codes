//*Strings are immutable in java i.e. we can not change existing string i.e. s[i] = 'a' is not possible */
public class StringIntro {
    public static void main(String[] args) {
        String name = new String("dishant"); // non-primitive data type must written with new keyword but with string we
                                             // can
                                             // skip that rule
        String name2 = "cool";
        System.out.println(name);
        name2 = name.replace('d', 'n');
        System.out.println(name2);
        System.out.println(name.charAt(0));
    }
}