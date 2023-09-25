package exercise2;

public class T8 {
 /*  Write a Java Function that increments a string,
It should take the string of unknown length. Don't use regular expressions.
Examples:
123 -> 124
53456 -> 53457
29 -> 30
*/
    public static String newString(String str) {

        // Changing a string to a array of chars
        char[] chars = str.toCharArray();

        // Initializing variables for carry and the index where we will start incrementing
        int carry = 1;

        // Looping through the characters in reverse order
        for (int i = chars.length - 1; i >= 0; i--) {
            char originalChar = chars[i];

            if (carry == 1) {
                if (originalChar == '9') {
                    // If the current character is '9', change it to '0' and continue with carry
                    chars[i] = '0';

                } else {
                    // Increment the current character and set carry to 0
                    chars[i] = (char) (originalChar + 1);
                    carry = 0;
                }
            }
        }

        // Changing the char array back to a string
        return new String(chars);
    }

    public static void main(String[] args) {
        String original = "12789" +
                "";
        String newString = newString(original);
        System.out.println("Original: " + original);
        System.out.println("Incremented: " + newString);
    }
}






