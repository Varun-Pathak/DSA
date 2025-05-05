package Strings;

public class Reverse {

    public static void main(String[] args) {
        String result = reverse("Varun");
        System.out.println(result);

    }

    private static String reverse(String word) {

        StringBuilder reverse = new StringBuilder();
        for (int i = word.length()-1; i >= 0 ; i--) {
            reverse.append(word.charAt(i));
        }
        return reverse.toString();
    }
}
