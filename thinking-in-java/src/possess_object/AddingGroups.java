package possess_object;

import java.util.*;

public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(collection);
        Integer[] moreIns = {6,7,8,9,10};
        collection.addAll(Arrays.asList(moreIns));
        System.out.println(collection);
        Collections.addAll(collection,11,12,13,14,15);
        Collections.addAll(Arrays.asList(moreIns));
        System.out.println(collection);
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1,88);
        list.add(99);
    }
}
