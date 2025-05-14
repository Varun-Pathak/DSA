package Strings;

public class EncryptString {

    public static void main(String[] args) {
        String result = encrypt("abc");
        System.out.println(result);

    }

    private static String encrypt(String word) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int count = 0;
            while (i < word.length() && word.charAt(i) == c){
                count++;
                i++;
            }
            stringBuilder.append(c).append(convertToHex(count));
            i--;
        }
        return stringBuilder.reverse().toString();
    }

    private static String convertToHex(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        while (num != 0){
            int rem = num % 16;
            if (rem < 10){
                char c = (char) (rem + '0');
                stringBuilder.append(c);
            }else {
                char c = (char) (rem - 10 + 'a');
                stringBuilder.append(c);
            }
            num /= 16;
        }
        return stringBuilder.reverse().toString();
    }
}
