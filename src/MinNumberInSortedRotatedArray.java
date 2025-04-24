public class MinNumberInSortedRotatedArray {

    public static void main(String[] args) {
        int[] items = {5,6,1,2,3,4};
        System.out.println(findMinNumber(items));
    }

    private static int findMinNumber(int[] items) {

        int low = 0, high = items.length-1;
        while(low < high){
            if(items[low] < items[high])
                return items[low];
            int mid = (low + high) / 2;
            if (items[mid] > items[high]){
                low = mid + 1;
            }else {
                high = mid;
            }
        }
        return items[low];
    }
}
