package Strings;

import java.util.Arrays;

public class LongestPrefix {

    public static void main(String[] args) {
        String result = findSubstring(new String[]{"abc","ab","abz"});
        System.out.println(result);

    }
    private static String findSubstring(String[] words) {

        Arrays.sort(words);
        String first = words[0], last = words[words.length-1];
        int minLength = Math.min(first.length(), last.length());
        int index = 0;
        for (int i = 0; i < minLength; i++) {
            if (first.charAt(i) == last.charAt(i)){
                index++;
            }else break;
        }
        return first.substring(0, index);
    }
}
