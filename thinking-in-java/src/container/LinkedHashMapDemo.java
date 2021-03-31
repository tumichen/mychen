package container;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1,"wojiuhehe") ;
        map.put(2,"迪丽热巴") ;
        map.put(3,"古力娜扎") ;
        map.put(4,"马尔扎哈") ;
        System.out.println(map);
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<Integer, String>(16,0.75f,true);
        map1.putAll(map);
        System.out.println(map1);
        for (int i = 0; i < 3; i++) {
            map1.get(i);
        }
        System.out.println(map);
        map.get(0);
        System.out.println(map);
    }
}
