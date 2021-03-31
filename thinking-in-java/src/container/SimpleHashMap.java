package container;

import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;

public class SimpleHashMap<K, V> extends AbstractMap<K, V> {
//    static final int SIZE = 997;
//    LinkedList<MapEntry<K, V>[]> buckets = new LinkedList[SIZE];
//
//    public V put(K key, V value) {
//        V oldValue = null;
//        int index = Math.abs(key.hashCode()) % SIZE;
//        if (buckets[index]==null){
//            buckets[index]= new LinkedList<MapEntry<K,V>>();
//        }
//        LinkedList<MapEntry<K,V>> bucket = buckets[index];
//        MapEntry<K,V> pair = new MapEntry<K,V>(key,value);
//        boolean found = false;
//        ListIterator<MapEntry<K, V>> iterator = bucket.listIterator();
//        while(iterator.hasNext()){
//            MapEntry<K, V> iPair = iterator.next();
//            if (iPair.getKey().equals(key)){
//                oldValue = iPair.getValue();
//                iterator.set(pair);
//                found = true;
//                break;
//            }
//        }
//        if (found){
//            buckets[index].add(pair);
//        }
//        return oldValue;
//    }
//    public V get(Object key){
//        int index = Math.abs(key.hashCode()) % SIZE;
//        if (buckets[index]==null){
//            return nulll
//        }
//        for (buckets:
//             ) {
//
//        };
//    }
//
    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
