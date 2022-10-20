import java.util.Scanner;

//*When compiler works in java runtime environment there need to be some function to begin execution with therefore we make our main function public*/

//*There are 4 types of access specifiers:- public, private, protected, default */
//*If we don't assign anything then it is default :- it can be accessed in whole file but can not be accessible in another package */
//*If we assign anything protected :- it can be accessed in whole file & can only be accessible to sub classes in another package */
class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        int name = sc.nextInt();
        System.out.println(name);
    }
}
