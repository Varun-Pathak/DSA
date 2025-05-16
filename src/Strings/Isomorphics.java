package Strings;

import java.util.HashMap;

public class Isomorphics {

    public static void main(String[] args) {
        boolean result = reverse("aab", "xyz");
        System.out.println(result);
    }
    private static boolean reverse(String word1, String word2) {

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        if (word1.length() != word2.length())
            return false;
        for (int i = 0; i < word1.length(); i++) {
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);
            if (!map1.containsKey(c1))
                map1.put(c1, i);
            if (!map2.containsKey(c2))
                map2.put(c2, i);
            if (map1.get(c1) != map2.get(c2))
                return false;
        }
        return true;
    }
}
