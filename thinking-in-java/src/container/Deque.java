package container;

import java.util.LinkedList;

public class Deque<T> {
    private LinkedList<T> deque = new LinkedList<T>();
    public void addFirst(T e){
        deque.addFirst(e);
    }


}
