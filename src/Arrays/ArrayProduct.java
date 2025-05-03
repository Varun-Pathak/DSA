package Arrays;

import java.util.*;

public class ArrayProduct {

    public static void main(String[] args) {
        int[] items = {1,-1,3,4};
        System.out.println(replaceItemWithProductOfOtherIntegersInArray(items));
    }

    private static int[] replaceItemWithProductOfOtherIntegersInArray(int[] items) {

        int product = 1;
        int zeroCount = 0;
        int zeroIdx = -1;
        int[] result = new int[items.length];
        Arrays.fill(result, 0);
        for (int i = 0; i < items.length; i++) {
            if(items[i] == 0){
              zeroCount++;
              zeroIdx = i;
            } else {
                product *= items[i];
            }
        }

        if(zeroCount == 0){
            for (int i = 0; i < items.length; i++) {
                result[i] = product/items[i];
            }
        } else if (zeroCount == 1) {
            result[zeroIdx] = product;
        }

        System.out.println(Arrays.toString(result));
        return result;
    }
}
