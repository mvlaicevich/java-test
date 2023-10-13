public class PalindromeLongestStringTest {

    public static void main(String[] args) {
        //Test Input: abac
        System.out.println(getLongestPalindrome("abac"));
        //Test Input: tacag
        System.out.println(getLongestPalindrome("tacag"));
        //Test Input: wegeeksskeegyuwe
        System.out.println(getLongestPalindrome("wegeeksskeegyuwe"));
    }

    public static String getLongestPalindrome(String input) {
        int maxPalindromeLength = 0;
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                String substring = input.substring(i, j + 1);
                //Check if substring is palindrome and length is bigger than maxPalindromeLength
                //if you have 2 of same maxPalindromeLength then it will return first one
                if (isPalindrome(substring) && substring.length() > maxPalindromeLength) {
                    maxPalindromeLength = substring.length();
                    result = substring;
                }
            }
        }
        return result;
    }
    public static boolean isPalindrome(String s) {
        int firstChar = 0;
        int lastChar = s.length() - 1;

        //checking if first and last char are same
        while (firstChar < lastChar) {
            if (s.charAt(firstChar) != s.charAt(lastChar)) {
                return false;
            }
            //if first and last char are same then increment firstChar and decrement lastChar
            firstChar++;
            lastChar--;
        }
        return true;
    }
}
