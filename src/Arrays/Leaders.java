package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Leaders {

    public static void main(String[] args) {
        int[] items = {16,17,4,3,5,2};
        ArrayList result = findLeaders(items);
        System.out.println(result);

    }

    private static ArrayList findLeaders(int[] items) {

        int maxRight = items[items.length-1];
        ArrayList<Integer> leaders = new ArrayList<>();
        leaders.add(maxRight);
        for (int i = items.length - 2; i >= 0; i--) {
            if (items[i] >= maxRight){
                leaders.add(items[i]);
                maxRight = items[i];
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
}
