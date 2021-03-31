package container;

import java.util.*;
import java.util.stream.Collectors;

public class Unsupported {
    static void test(String msg,List<String> list){
        System.out.println("-----"+msg+"-----");
        Collection<String> c = list;
        Collection<String> subList = list.subList(1, 8);
        ArrayList<String> c2 = new ArrayList<>(subList);
        try {
            c.retainAll(c2);
        }catch (Exception e){
            System.out.println("retainAll"+e);
        }
        try{
            c.clear();
        }catch (Exception e){
            System.out.println("clear()"+e);
        }
        try {
            c.add("x");
        }catch (Exception e){
            System.out.println("add"+e);
        }
        try {
            c.addAll(c2);
        }catch (Exception e){
            System.out.println("add"+e);
        }
        try {
            c.remove("C");
        }catch (Exception e){
            System.out.println("add"+e);
        }
        try {
            list.set(0,"X");
        }catch (Exception e){
            System.out.println("list.set()"+e);
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A B C D E F G H I G K L".split(" "));
        test("Modifiable Copy",new ArrayList<String>(list));
        test("Arrays.adList()",list);
    }

}
