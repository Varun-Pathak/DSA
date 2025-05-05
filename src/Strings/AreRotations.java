package Strings;

public class AreRotations {

    public static void main(String[] args) {
        boolean result = reverse("abcd", "acbd");
        System.out.println(result);

    }

    private static boolean reverse(String word1, String word2) {

        word1 = word1 + word1;
        return word1.contains(word2);

    }
}
