/*
Task
In this simple Kata your task is to create a function that turns a string into a Mexican Wave.
You will be passed a string and you must return that string in an array where an uppercase letter is a person standing up.

Rules
 1.  The input string will always be lower case but maybe empty.
 2.  If the character in the string is whitespace then pass over it as if it was an empty seat
Example
wave("hello") => {"Hello", "hEllo", "heLlo", "helLo", "hellO"}
 */

import java.util.ArrayList;
import java.util.List;

public class mexicanWave {
    public static String[] wave(String str) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                String waveStr = str.substring(0, i) + Character.toUpperCase(c) + str.substring(i + 1);
                result.add(waveStr);
            }
        }
        return result.toArray(result.toArray(new String[0]));
    }

    public static void main(String[] args) {
        String[] waveArray = wave("hello");
        for (String wave : waveArray) {
            System.out.println(wave);
        }
    }
}