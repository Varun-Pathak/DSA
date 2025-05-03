package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateIntegers {

    public static void main(String[] args) {
        int[] items = {11,6,3,1,100,6,11,11,6,3,3};
        System.out.println(findDuplicateItems(items));
    }

    private static List<Integer> findDuplicateItems(int[] items) {

        ArrayList<Integer> duplicateItems = new ArrayList<>();
        HashMap<Integer, Integer> itemsCount = new HashMap<>();
        for(int item : items){
           itemsCount.put(item, itemsCount.getOrDefault(item, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : itemsCount.entrySet()){
            if(entry.getValue() > 1){
                duplicateItems.add(entry.getKey());
            }
        }
        return duplicateItems;
    }
}
