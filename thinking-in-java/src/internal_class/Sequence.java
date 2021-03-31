package internal_class;

interface Selector {
    boolean end();
    Object current();
    void next();
}
public class Sequence{
    private Object[] items ;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }
    public void add(Object obj){
        if (next<items.length){
            items[next++] = obj;
        }
    }
    private class SequeceSelector implements Selector{
        private int i;
        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i<items.length){
                i++;
            }
        }
    }
    public Selector selector(){
        return new SequeceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        while (!selector.end()){
            System.out.println(selector.current()+"");
            selector.next();
        }
    }


}
