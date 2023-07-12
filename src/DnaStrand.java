/*
Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the development and functioning of living organisms.

If you want to know more: http://en.wikipedia.org/wiki/DNA

In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G".
Your function receives one side of the DNA (string, except for Haskell); you need to return the other complementary side.
DNA strand is never empty or there is no DNA at all (again, except for Haskell).

More similar exercise are found here: http://rosalind.info/problems/list-view/ (source)

Example: (input --> output)

"ATTGC" --> "TAACG"
"GTAT" --> "CATA"
 */


public class DnaStrand {
    public static String makeComplement(String dna) {

        char[] charArray = dna.toCharArray();
        StringBuilder otherDna = new StringBuilder();

        for (char c : charArray) {
            switch (c) {
                case 'A':
                    otherDna.append('T');
                    break;
                case 'T':
                    otherDna.append('A');
                    break;
                case 'G':
                    otherDna.append('C');
                    break;
                case 'C':
                    otherDna.append('G');
                    break;
            }
        }
        return otherDna.toString();
    }

    public static void main(String[] args) {
    System.out.println(makeComplement("ATGC"));
    }
}

