package Arrays;

import java.util.Arrays;

public class InsertDuplicates {

    public static void main(String[] args) {
        int[] items = {1,2,3,4};
        int[] result = insertDuplicates(items,2);
        System.out.println(Arrays.toString(result));

    }

    private static int[] insertDuplicates(int[] items, int num) {

        int[] newArr = new int[2 * items.length];
        int j = 0;
        for (int i = 0; i < items.length; i++) {
            newArr[j++] = items[i];
            if (items[i] == num)
                newArr[j++] = num;
        }
        return Arrays.copyOf(newArr, items.length);
    }
}
