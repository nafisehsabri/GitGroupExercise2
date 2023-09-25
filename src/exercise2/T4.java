package exercise2;

public class T4 {
    /*  Count the Number of Words in a String: Write a function to count the number of words in
    a given string. Words are separated by spaces or punctuation. For example, the input "Hello,
    world!" should return 2.*/

    public static class WordCount {

        static int countWords(String str) {
            int count = 0;
            boolean inSide = false; // for tracking if we are inside (of a word)

            // looping through all the characters
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);


    /* Important: Character.isLetterOrDigit(c) method is a built-in Java method that belongs to the
       Character class. It returns true if the character c is a Unicode letter (a character used
       in writing a language) or a digit (0-9), and false otherwise.*/

                if (Character.isLetterOrDigit(c)) {
                    // If we were not already inside a word, increment the count
                    if (!inSide) {
                        count++;
                        inSide= true; // Set inSide to true to indicate we are inside a word
                    }
                } else {
                    // If the current character is a separator, set inSide to false
                    inSide = false;
                }
            }
            return count;
        }

        public static void main(String[] args) {
            String s = "Hello Syntax students!";
            System.out.println("Number of words is " + countWords(s));
        }
    }

}
