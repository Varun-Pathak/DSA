import java.util.Arrays;

public class KadanesAlgo {

    public static void main(String[] args) {
        int[] items = {2,3,-8,7,-1,2,3};
        System.out.println(findMaxSubArray(items));
    }

    private static int findMaxSubArray(int[] items) {

        int maxSum = items[0];
        int result = items[0];
        for(int i=1; i< items.length; i++){
            maxSum = Math.max(maxSum+items[i], items[i]);
            result = Math.max(result, maxSum);
        }
        return result;
    }
}
