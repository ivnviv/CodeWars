/*  Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.*/

import static org.junit.Assert.assertEquals;

public class PigLatin {

    public static String pigIt(String str) {
        StringBuilder res = new StringBuilder();
        String[] parts = str.split(" ");
        String firstLetter;
        String withoutFirstLetter;


        for (int i = 0; i < parts.length; i++) {
            if (containsOnlyLetters(parts[i])) {

                firstLetter = String.valueOf(parts[i].charAt(0));
                withoutFirstLetter = parts[i].substring(1);

                res.append(withoutFirstLetter).append(firstLetter).append("ay");
            } else {
                res.append(parts[i]);
            }

            if (i < parts.length - 1) {
                res.append(" ");
            }
        }


        return res.toString();
    }

    private static boolean containsOnlyLetters(String word) {
        for (char c : word.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool") + " and should be \"igPay atinlay siay oolcay\"");
        System.out.println(pigIt("This is my string") + " and should be \"hisTay siay ymay tringsay\"");

        //assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt());
        //assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt());
    }
}
