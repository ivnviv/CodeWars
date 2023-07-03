/*
In this example you have to validate if a user input string is alphanumeric.
The given string is not nil/null/NULL/None, so you don't have to check that.

The string has the following conditions to be alphanumeric:

At least one character ("" is not valid)
Allowed characters are uppercase / lowercase latin letters and digits from 0 to 9
No whitespaces / underscore
 */
public class SecureTester {
    public static boolean alphanumeric(String s) {
        if (s.isEmpty()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.toLowerCase().charAt(i);
            if (!(c >= '0' && c <= '9') && !isEnglishLetter(c)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isEnglishLetter(char c) {
        c = Character.toLowerCase(c);
        return c >= 'a' && c <= 'z';
    }

    public static void main(String[] args) {
        System.out.println("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 - " + alphanumeric("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));
        System.out.println("  - " + alphanumeric(" "));
        System.out.println("with space -" + alphanumeric("with space"));
        System.out.println("with_underscore -" + alphanumeric("with_underscore"));
        System.out.println("punctuation. -" + alphanumeric("punctuation."));
        System.out.println("naïve -" + alphanumeric("naïve"));
        System.out.println("１strangedigit - " + alphanumeric("１strangedigit"));
        System.out.println("emoji\uD83D\uDE0A - " + alphanumeric("emoji\uD83D\uDE0A"));

    }
}
