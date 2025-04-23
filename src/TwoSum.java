import java.util.HashSet;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {1,6,3,-1,100};
        System.out.println(findSumPair(arr, 101));
    }

    private static boolean findSumPair(int[] arr, int sum) {

        HashSet<Integer> integers = new HashSet<>();
        int complement;
        for(int n : arr){
            complement = sum - n;
            if (integers.contains(complement)){
                return true;
            }
            integers.add(n);
        }
        return false;
    }
}
