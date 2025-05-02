import java.util.ArrayList;
import java.util.Arrays;

public class AlternatePosNeg {

    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>(Arrays.asList(3,2,3,-1,-2,-3));
        ArrayList result = rearrangeItems(items);
        System.out.println(result);

    }

    private static ArrayList rearrangeItems(ArrayList<Integer> items) {

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            Integer num = items.get(i);
            if (num >= 0){
                pos.add(num);
            }else {
                neg.add(num);
            }
        }
        int indexPos = 0, indexNeg = 0, index = 0;
        while (indexPos < pos.size() && indexNeg < neg.size()){
            if (index % 2 == 0)
                items.set(index++, pos.get(indexPos++));
            else
                items.set(index++, neg.get(indexNeg++));
        }
        while (indexPos < pos.size()){
            items.set(index++, pos.get(indexPos++));
        }
        while (indexNeg < neg.size()){
            items.set(index++, neg.get(indexNeg++));
        }
        return items;
    }
}
