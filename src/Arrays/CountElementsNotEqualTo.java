package Arrays;

import java.util.Arrays;

public class CountElementsNotEqualTo {

    public static void main(String[] args) {
        int[] items = {1,9,1,9};
        int result = countNumbers(items, 1);
        System.out.println(result);

    }

    private static int countNumbers(int[] items, int n) {

        int count = 0;
        for (int i = 0; i < items.length; i++) {
            if(items[i] != n){
                count++;
            }
        }
        return count;

    }
}
