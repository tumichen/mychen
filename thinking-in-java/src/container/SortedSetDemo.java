package container;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();
        Collections.addAll(sortedSet, "one two three four five six serve eight".split(" "));
        System.out.println(sortedSet);
        String first = sortedSet.first();
        System.out.println(first);
        String last = sortedSet.last();
        System.out.println(last);
        Iterator<String> it = sortedSet.iterator();
        for (int i = 0; i <= 6; i++) {
            if (i == 3) {
                first = it.next();
            }
            if (i == 6) {
                last = it.next();
            }else it.next();
        }
        System.out.println(first);
        System.out.println(last);
        System.out.println(((TreeSet<String>) sortedSet).subSet(first,last));
        System.out.println(((TreeSet<String>) sortedSet).headSet(last));
        System.out.println(((TreeSet<String>) sortedSet).tailSet(first));
    }

}
