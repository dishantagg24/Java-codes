
public class CastingIntro {
    public static void main(String[] args) {
        double price = 100.00;
        double finalPrice = price + 18; // implicit casting
        System.out.println(finalPrice);

        int p = 100;
        // int fp = p + 18.00; //gives error double size = 8 and int size = 4 so 18.00
        // overflows when trying to convert to int
        int fp = p + (int) 18.00; // explicit casting
        System.out.println(fp);

        final int a = 34; // final is like const keyword
        System.out.println(Math.max(5, 6)); // 6
        System.out.println(Math.min(5, 6)); // 5
    }
}
