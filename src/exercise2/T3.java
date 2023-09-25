package exercise2;

import java.util.Scanner;

public class T3 {
    /*  Check if a String is Palindrome: Determine whether a given string is a palindrome, which means it reads the same forwards and
backward. For example, "madam" is a palindrome.
     */

    public static void main(String[] args) {

        String str1 = "";
        String str2 = "";

        Scanner input = new Scanner(System.in);
        System.out.print("In:");
        String Str = input.nextLine();

        String[] strs = Str.split("");

        for(int i=0; i< strs.length; i++){
            str1 = strs[i].trim();
        }

        for(int i = strs.length -1; i >= 0; i--){
            str2 = strs[i].trim();
        }

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("palindrome");

        } else {
            System.out.println("not a palindrome");
        }

    }

}
