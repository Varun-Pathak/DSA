import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindMissing {

    public static void main(String[] args) {
        int[] items = {4,3,6,2,1,1};
        ArrayList result = findMissingNumber(items);
        System.out.println(result);

    }

    private static ArrayList findMissingNumber(int[] items) {

        int[] arr = new int[items.length+1];
        for (int i = 0; i < items.length; i++) {
            arr[items[i]]++;
        }
        int missing = -1, duplicate = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0){
                missing = i;
            } else if (arr[i] > 1) {
                duplicate = i;
            }
        }
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> result = new ArrayList<>();
        result.add(duplicate);
        result.add(missing);
        return result;
    }
}
