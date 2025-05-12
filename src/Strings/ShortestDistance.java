package Strings;

import java.util.List;

public class ShortestDistance {

    public static void main(String[] args) {
        int result = findShortestDistance(List.of("the", "quick", "brown", "fox", "quick"), "the", "quick");
        System.out.println(result);

    }

    private static int findShortestDistance(List words, String word1, String word2) {

        int d1 = -1, d2 = -1, minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals(word1)){
                d1 = i;
            }
            if (words.get(i).equals(word2)){
                d2 = i;
            }
            if (d1 != -1 && d2 != -1){
                minDistance = Math.min(minDistance, Math.abs(d1-d2));
            }
        }
        return minDistance;
    }
}
