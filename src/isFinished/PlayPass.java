/*
Everyone knows passphrases. One can choose passphrases from poems, songs, movies names and so on but frequently they can be guessed due to common cultural references.
You can get your passphrases stronger by different means. One is the following:

choose a text in capital letters including or not digits and non alphabetic characters,

shift each letter by a given number but the transformed letter must be a letter (circular shift),
replace each digit by its complement to 9,
keep such as non alphabetic and non digit characters,
downcase each letter in odd position, upcase each letter in even position (the first character is in position 0),
reverse the whole result.
Example:
your text: "BORN IN 2015!", shift 1

1 + 2 + 3 -> "CPSO JO 7984!"

4 "CpSo jO 7984!"

5 "!4897 Oj oSpC"

With longer passphrases it's better to have a small and easy program. Would you write it?
 */

package isFinished;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PlayPass {
    public static String playPass(String s, int n) {
        char[] letters = s.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (Character.isDigit(letters[i])) {
                int numericValue = Character.getNumericValue(letters[i]);
                int transformedValue = 9 - numericValue;
                letters[i] = (char) (transformedValue + '0');
            } else if (Character.isLetter(letters[i])) {
                if (i % 2 != 0) {
                    letters[i] = Character.toLowerCase(letters[i]);
                } else {


                    letters[i] = Character.toUpperCase(letters[i]);
                }

                letters[i] += n;
            }
        }
        StringBuilder reversed = new StringBuilder(new String(letters)).reverse();

        return reversed.toString();
    }

    @Test
    public void test1() {
        assertEquals("!!!vPz fWpM J", PlayPass.playPass("I LOVE YOU!!!", 1));

    }
    //не проходит тест. проблема с char > x. Разобраться позже
    @Test
    public void test4() {
        assertEquals("4897 NkTrC Hq fT67 GjV Pq aP OqTh gOcE CoPcTi aO",
                PlayPass.playPass("MY GRANMA CAME FROM NY ON THE 23RD OF APRIL 2015", 2));
    }
}