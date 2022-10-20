
public class BasicProg {

    static int fact(int n) {
        int ans = 1;
        for (int i = n; i >= 2; i--) {
            ans *= i;
        }
        return ans;
    }

    static int fib(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }

    public static void main(String args[]) {
        int res = fact(5);
        System.out.println(res);
        int res2 = fib(5);
        System.out.println(res2);
        printPattern(5);
    }
};