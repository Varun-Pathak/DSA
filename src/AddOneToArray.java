import java.util.Arrays;

public class AddOneToArray {

    public static void main(String[] args) {
        int[] items = {1,9,1};
        int[] result = addOne(items);
        System.out.println(Arrays.toString(result));

    }

    private static int[] addOne(int[] items) {

        int carry =1;
        for (int i = items.length-1; i >= 0 ; i--) {
            int sum = items[i] + carry;
            items[i] = sum % 10;
            carry = sum / 10;
        }
        if(carry > 0){
            int[] newArr = new int[items.length + 1];
            newArr[0] = carry;
            System.arraycopy(items, 0, newArr, 1, items.length);
            return newArr;
        } else {
            return items;
        }

    }
}
