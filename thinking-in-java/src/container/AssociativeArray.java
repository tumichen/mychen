package container;

import java.util.Arrays;
import java.util.TreeMap;

public class AssociativeArray<K,V> {
    private Object[][] pairs;
    private int index;
    public AssociativeArray(int length){
        pairs = new Object[length][2];
    }
    public void put(K key,V value){
        if (index>pairs.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        pairs[index++]=new Object[]{key,value};
    }
    public V get(K key){
        for (int i = 0; i < index; i++) {
            if (key.equals(pairs[i][0])){
                return (V)pairs[i][1];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "AssociativeArray{" +
                "pairs=" + Arrays.toString(pairs) +
                ", index=" + index +
                '}';
    }

    public static void main(String[] args) {
        AssociativeArray<String, String> map = new AssociativeArray<String, String>(6);
        map.put("sky","blue");
        map.put("grass","green");
        map.put("ocean","dancing");
        map.put("tree","tail");
        map.put("earth","brow");
        map.put("sun","warm");
        try {
            map.put("extra","object");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("我装不下了");
        }
        System.out.println(map);
        System.out.println(map.get("sky"));
    }
}
