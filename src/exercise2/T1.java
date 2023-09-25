package exercise2;

public class T1 {
    public static void main(String[] args) {
        /*        Write a program to swap 2 String without a temporary variable?
         */
        int a = 10;
        int b = 5;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);

    }
}

