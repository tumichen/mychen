package possess_object;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class InterfaceVsInerator {
    public static void display(Iterator<String> it){
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
    }
    public static void display(Collection<String> dd){
        for (String d :dd){
            System.out.println(d);
        }
    }
    @Test
public void test(){
    List<String> list = new ArrayList<>(8);
}
}
