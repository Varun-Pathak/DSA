package Arrays;

import java.util.Arrays;

public class MaxProductSubArray {

    public static void main(String[] args) {
        int[] items = {-1,-3,-10,0,60};
        System.out.println(findMaxProductSubArray(items));
    }

    private static int findMaxProductSubArray(int[] items) {

        int leftToRight = 1, rightToLeft = 1, result = Integer.MIN_VALUE;
        for (int i = 0; i < items.length; i++) {
            if(leftToRight != 0){
                leftToRight *= items[i];
            }else {
                leftToRight = 1;
            }
            int j = items.length - 1 - i;
            if(rightToLeft != 0){
                rightToLeft *= items[j];
            }else {
                rightToLeft = 1;
            }
            result = Math.max(leftToRight, Math.max(rightToLeft, result));
        }
        return result;
    }
}
