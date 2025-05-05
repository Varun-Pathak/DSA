package Strings;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseSentence {

    public static void main(String[] args) {
        String result = reverse("varun is a good boy");
        System.out.println(result);

    }

    private static String reverse(String word) {

        ArrayList<String> wordsList = new ArrayList<>();
        String[] words = word.split(" ");
        for (String word1 : words){
            wordsList.add(word1);
        }
        Collections.reverse(wordsList);
        String reversed = String.join(" ", wordsList);
        return reversed;

    }
}
