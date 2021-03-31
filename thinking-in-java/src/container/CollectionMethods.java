package container;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionMethods {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("ten");
        c.add("eleven");
        System.out.println(c);
        Object[] array = c.toArray();
        String[] array1 = c.toArray(new String[0]);
        System.out.println(Collections.max(c));
        System.out.println(Collections.min(c));
        Collection<String> c2 = new ArrayList<>();
        c.addAll(c2);
        System.out.println(c);
    }
}
