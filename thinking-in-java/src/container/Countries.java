package container;

import java.util.*;

public class Countries {
    public static final String[][] DATA = {
            {"AlGERIA", "Algiers"}, {"ANGOLA", "Luanda"}
    };

//    //private static class FlyweightMap extends AbstractMap<String, String> {
//        private static class Entry implements Map.Entry<String, String> {
//            int index;
//
//            Entry(int index) {
//                this.index = index;
//            }
//
//            @Override
//            public boolean equals(Object obj) {
//                return DATA[index][0].equals(obj);
//            }
//
//            public String getKey() {
//                return DATA[index][0];
//            }
//
//            public String getValue() {
//                return DATA[index][0];
//            }
//
//            public String setValue(String value) {
//                throw new UnsupportedOperationException();
//            }
//
//            public int hashCode() {
//                return DATA[index][0].hashCode();
//            }
//        }
//
//        static class EntrySet extends AbstractSet<Map.Entry<String, String>> {
//            private int size;
//
//            EntrySet(int size) {
//                if (size < 0) {
//                    this.size = 0;
//                } else if (size > DATA.length) {
//                    this.size = DATA.length;
//                } else {
//                    this.size = size;
//                }
//            }
//            public int size(){
//                return size;
//            }
//            private class Iter implements Iterator<Map.Entry<String,String>>{
//                private Entry entry = new Entry(-1);
//                public boolean hasNext(){
//                    return entry.index<size-1;
//                }
//                public Map.Entry<String,String> next(){
//                    entry.index++;
//                    return entry;
//                }
//                public void remove(){
//                    throw new UnsupportedOperationException();
//                }
//            }
//            public Iterator<Map.Entry<String,String>> iterator(){
//                return new Iter();
//            }
//        }
//        private static Set<Map.Entry<String,String>> entries = new EntrySet(DATA.length);
//
//    }
}
