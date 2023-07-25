package isFinished;

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

