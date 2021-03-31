package container;

import java.util.*;

public class SlowMap<K, V> extends AbstractMap<K, V> {
    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
//    private List<K> keys = new ArrayList<>();
//    private List<V> values = new ArrayList<>();
//
//    public V put(K key, V value) {
//        V oldvalue = get(key);
//        if (!keys.contains(key)) {
//            keys.add(key);
//            values.add(value);
//        } else {
//            //使key和value保持一致index
//            values.set(keys.indexOf(key), value);
//        }
//        return oldvalue;
//    }
//
//    public V get(Object key) {
//        if (!keys.contains(key)) {
//            return null;
//        }
//        return values.get(keys.indexOf(key));
//    }
//
//    @Override
//    public Set<Entry<K, V>> entrySet() {
//        HashSet<Entry<K, V>> set = new HashSet<>();
//        Iterator<K> k1 = keys.iterator();
//        Iterator<V> v1 = values.iterator();
//        while (k1.hasNext()) {
//            set.add(new MapEntry<K, V>(k1.next(), v1.next()));
//        }
//        return set;
//    }
//
//    public static void main(String[] args) {
//        SlowMap<String, String> slowMap = new SlowMap<>();
////        slowMap.putAll();
//    }
//}
//
//class MapEntry<K, V> implements Map.Entry<K, V> {
//    private K key;
//    private V value;
//
//    public MapEntry(K key, V value) {
//        this.key = key;
//        this.value = value;
//    }
//    public K getKey(){
//        return key;
//    }
//    public V getValue(){
//        return value;
//    }
//    public V setValue(V v){
//        V result = value;
//        value = v;
//        return result;
//    }
//    public int hashCode(){
//        return (key==null?0:key.hashCode()) ^ (value==null?0:value.hashCode());
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        return true;
//    }
}