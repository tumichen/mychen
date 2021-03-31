package possess_object;

import org.junit.Test;

import java.util.Iterator;

public class IterableClass implements Iterable<String> {
    protected String[] words = ("and that is how wo know the Earth tobe banana-shaped").split(" ");

    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }
    @Test
    public void test(){
        for(String s : new IterableClass()){
            System.out.print(s+" ");
        }
    }

}
