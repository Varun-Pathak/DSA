package Strings;

import java.util.Arrays;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {
        char result = findChar("abcdabcd");
        System.out.println(result);

    }

    private static char findChar(String word) {

        int[] visited = new int[26];
        Arrays.fill(visited, -1);
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (visited[index] == -1) {
                visited[index] = i;
            }else {
                visited[index] = -2;
            }
        }
        int strIdxMin = -1;
        for (int strIdx : visited){
            if (strIdx >= 0){
                if (strIdx < strIdxMin || strIdxMin == -1){
                    strIdxMin = strIdx;
                }
            }
        }
        return strIdxMin == -1 ? '$' : word.charAt(strIdxMin);
    }
}
