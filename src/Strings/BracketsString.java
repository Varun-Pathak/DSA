package Strings;

public class BracketsString {

    public static void main(String[] args) {
        int result = findEqualPoint("))");
        System.out.println(result);

    }

    private static int findEqualPoint(String str) {

        int closeCount = 0, openCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')')
                closeCount++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (openCount == closeCount)
                return i;
            if (str.charAt(i) == '(')
                openCount++;
            if (str.charAt(i) == ')')
                closeCount--;
        }
        return -1;
    }
}
