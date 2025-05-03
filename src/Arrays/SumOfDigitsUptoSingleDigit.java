package Arrays;

import java.util.Arrays;

public class SumOfDigitsUptoSingleDigit {

    public static void main(String[] args) {
        int[] items = {1,9,1};
        int result = addDigits(55051);
        //System.out.println(Arrays.toString(result));
        System.out.println(result);
    }

    private static int addDigits(int num) {

        if(num == 0)
            return 0;
        if(num % 9 == 0)
            return 9;
        return num % 9;

    }
}
