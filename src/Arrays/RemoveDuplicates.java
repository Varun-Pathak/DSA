package Arrays;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] items = {1,1,9,9,10};
        int[] result = removeDuplicates(items);
        System.out.println(Arrays.toString(result));

    }

    private static int[] removeDuplicates(int[] items) {

        int count = 1;
        for (int i = 1; i < items.length; i++) {
            if(items[i] != items[i-1]){
                items[count] = items[i];
                count++;
            }
        }

        return items;

    }
}
