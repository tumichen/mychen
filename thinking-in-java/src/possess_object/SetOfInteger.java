package possess_object;

import org.junit.Test;


import java.util.*;

public class SetOfInteger {
    @Test
    public void test01(){
        Random random = new Random(47);
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < 10000; i++) {
            set.add(random.nextInt(30));
        }
        System.out.println(set.toString());
    }

    @Test
    public void test02(){
        Random random = new Random();
        Set<String> set = new TreeSet<>();
        set.add("sfdsfsfsfsfs");
        set.add("sfdsfsfsfsfs22222");
        set.add("sfdsfsfsfsfs33333");
        set.add("sfdsfsfsfsfs444444");
        System.out.println(set);
    }

    @Test
    public void test03(){
        Random random = new Random(47);
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            int r = random.nextInt(20);
            Integer integer = map.get(r);
            map.put(r,integer==null?1:++integer);
        }
        System.out.println(map);
    }
    static class QueueDemo{
        public static void pringQ(Queue queue){
            while (queue.peek()!=null){
                System.out.println(queue.remove());
                System.out.println();
            }
        }
    }

    @Test
    public void test05(){
        Queue<Integer> queue = new LinkedList<>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++) {
            queue.offer(rand.nextInt(i+10));
        }
        QueueDemo.pringQ(queue);
    }
}
