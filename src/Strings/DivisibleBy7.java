package Strings;

public class DivisibleBy7 {

    public static void main(String[] args) {
        boolean result = isDivisibleBy7(51);
        System.out.println(result);

    }

    private static boolean isDivisibleBy7(int num) {

        while (num >= 10){
            int b = num % 10;
            int a = num / 10;
            num = Math.abs(a - 2*b);
        }
        return num == 0 || num == 7;
    }
}
