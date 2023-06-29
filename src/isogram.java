/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.

Example: (Input --> Output)

"Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)

isIsogram "Dermatoglyphics" = true
isIsogram "moose" = false
isIsogram "aba" = false
 */


public class isogram {
    public static boolean  isIsogram(String str) {

        str = str.toLowerCase();
        char[] charArray = str.toCharArray();

        for(int i = 0; i < charArray.length; i++){
            for (int j = i + 1; j < charArray.length;j++){
                if(charArray[i] == charArray[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("ppkq")); // false
        System.out.println(isIsogram("Dermatoglyphics")); // true
        System.out.println(isIsogram("moose")); // false
    }
}

