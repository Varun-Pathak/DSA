public class SecondLargestNumber {

    public static void main(String[] args) {
        int[] items = {5,6,1,22,3,4,11};
        System.out.println(findSecondLargest(items));
    }

    private static int findSecondLargest(int[] items) {

        int largest = -1, secondLargest = -1;
        for(int item : items){
            if(item > largest){
                secondLargest = largest;
                largest = item;
            } else if (item < largest && item > secondLargest) {
                secondLargest = item;
            }
        }
        return secondLargest;
    }
}
