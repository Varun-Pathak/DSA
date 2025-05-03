package Strings;

public class Palindrome {

    public static void main(String[] args) {
        boolean result = checkPalindrome("madame");
        System.out.println(result);

    }

    private static boolean checkPalindrome(String word) {

        int start = 0, end = word.length()-1;
        while(start < end){
            if (word.charAt(start++) != word.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}
