package exercise2;

import java.util.ArrayList;
import java.util.List;

public class T7 {
    /* You have a list of strings, and you want to keep only those that start
with “A” and you want to return them in lower case.
*/
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("Alligator");
        strings.add("Baboon");
        strings.add("Octopus");
        strings.add("Axolotl");
        strings.add("Abyssinian");

        List<String> newStrings = new ArrayList<>();

        for (String s : strings) {
            if (s.startsWith("A")) {
                newStrings.add(s.toLowerCase());
            }
        }


        for (String str : newStrings) {
            System.out.println(str);
        }
    }
    }

