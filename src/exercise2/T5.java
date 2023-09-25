package exercise2;

import java.util.Arrays;

public class T5 {
    /* Check if Two Strings are Anagrams: Given two strings, determine if they are anagrams, meaning they contain the same characters in a
different order. For example, "listen" and "silent" are anagrams.
*/
    static boolean isAnagram(String s1, String s2)
    {
        char[] arrA = s1.toCharArray();
        char[] arrB = s2.toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);

        return Arrays.equals(arrA, arrB);
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "hear";

        if (isAnagram(s1, s2)) {
            System.out.println("The two strings are anagram");
        }
        else {
            System.out.println("The two strings are not anagram");
        }
    }
}
