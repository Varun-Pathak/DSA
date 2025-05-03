package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingRange {

    public static void main(String[] args) {
        int[] items = {14,15,20,30,31,45};
        ArrayList result = findMissingRanges(items, 10, 50);
        System.out.println(result);

    }

    private static ArrayList findMissingRanges(int[] items, int low, int high) {

        ArrayList<List<Integer>> result = new ArrayList<>();
        if (low < items[0]){
            result.add(Arrays.asList(low, items[0]-1));
        }
        for (int i = 1; i < items.length; i++) {
            if (items[i] - items[i-1] > 1){
                result.add(Arrays.asList(items[i-1]+1, items[i]-1));
            }
        }
        if (high > items[items.length-1]){
            result.add(Arrays.asList(items[items.length-1]+1, high));
        }
        return result;
    }
}
