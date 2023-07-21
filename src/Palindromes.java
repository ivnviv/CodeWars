public class Palindromes {
    public static int longestPalindrome(final String s) {
        char[] charArray = s.toCharArray();
        int counter = 0;

        if (charArray.length == 2 && charArray[0] == charArray[1]) {
            counter = 2;
            return counter;
        }

        for (int i = 0; i < charArray.length; i++) {


        }
        if (counter == 0) {
            counter = 1;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("a") + ", and expected: 1");
        System.out.println(longestPalindrome("aa") + ", and expected: 2");
        System.out.println(longestPalindrome("baa") + ", and expected: 2");
        System.out.println(longestPalindrome("aab") + ", and expected: 2");
        System.out.println(longestPalindrome("zyabyz") + ", and expected: 1");
        System.out.println(longestPalindrome("baabcd") + ", and expected: 4");
        System.out.println(longestPalindrome("baablkj12345432133d") + ", and expected: 9");

    }
}