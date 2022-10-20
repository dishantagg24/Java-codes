import java.util.Arrays;

//*When value is not declared in any primitive or non-primitive data type, it is defined with null value like for integer array, array will be initialised with 0 values & for boolean array, array will be initialised with false values */

public class ArrayIntro {
    public static void main(String[] args) {
        int[] marks = new int[3];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = i;
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        Arrays.sort(marks); // Arrays class
        int[] marks2 = { 45, 99, 89 };
        int[][] finalMarks = { { 99, 95, 87 }, { 83, 93, 92 } }; // 2d array
        System.out.println(finalMarks[0][0]);
    }
}
