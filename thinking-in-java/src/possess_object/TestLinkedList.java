package possess_object;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

public class TestLinkedList {
    private LinkedList<String> linkedList;

    @Before
    public void test01(){
        linkedList = new LinkedList<>();
    }

    @Test
    public void test02(){
        linkedList.add("迪丽热巴");
        System.out.println(linkedList);
        linkedList.addFirst("dulinazha");
        System.out.println(linkedList);
        String peek = linkedList.peek();
        System.out.println(peek);
        System.out.println(linkedList.size());
        String pop = linkedList.pop();
        System.out.println(pop);
        System.out.println(linkedList.size());
    }

}
