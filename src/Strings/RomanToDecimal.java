package Strings;

public class RomanToDecimal {

    public static void main(String[] args) {
        int result = convert("XLVII");
        System.out.println(result);

    }
    private static int convert(String roman) {

        int result = 0;
        for (int i = 0; i < roman.length(); i++) {
            if (i != roman.length()-1 && value(roman.charAt(i)) < value(roman.charAt(i+1))){
                result += value(roman.charAt(i+1)) - value(roman.charAt(i++));
            }else {
                result += value(roman.charAt(i));
            }
        }
        return result;
    }

    private static int value(char ch) {
        if (ch == 'I')
           return 1;
        if (ch == 'V')
            return 5;
        if (ch == 'X')
            return 10;
        if (ch == 'L')
            return 50;
        if (ch == 'C')
            return 100;
        if (ch == 'D')
            return 500;
        if (ch == 'M')
            return 1000;
        throw new RuntimeException("Invalid Character");
    }
}
