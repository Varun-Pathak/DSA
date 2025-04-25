public class FindNumberInSortedRotatedArray {

    public static void main(String[] args) {
        int[] items = {5,6,1,2,3,4};
        System.out.println(findNumber(items, 4));
    }

    private static int findNumber(int[] items, int key) {

        int low = 0, high = items.length-1;
        while(low <= high){
            int mid = (low+high) / 2;
            if(items[mid] == key)
                return mid;
            if(items[low] < items[mid]){
                if(key >= items[low] && key < items[mid]){
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if(key <= items[high] && key > items[mid]){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
