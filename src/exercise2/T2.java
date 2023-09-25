package exercise2;

import java.util.Scanner;

public class T2 {
    /*  Reverse a String: Write a function to reverse a given string. For
example, given the input "Hello", the output should be "olleH".
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("In:");
        String word = input.nextLine();

        String[] string = word.split("");
        for (int i=string.length-1; i>=0; i--)
            System.out.print(string[i]);

    }
}
