package Arrays;

import java.util.Random;

public class CompType implements Comparable<CompType> {
    int i;
    int j;
    private static int count = 1;

    public CompType(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String toString() {
        String result = "CompType{" +
                "i=" + i +
                ", j=" + j +
                '}';
        if (count++ % 3 == 0) {
            result += "\n";
        }
        return result;
    }

    @Override
    public int compareTo(CompType rv) {
        return (i < rv.i ? -1 : (i == rv.i ? 0 : 1));
    }
//    private static Random r = new Random(47);
//    public static Generator<CompType> generator(){
//        return new Generator<CompType>(){
//            public CompType next(){
//                return new CompType((r.nextInt(100),r.nextInt(100)));
//            }
//        }
//    }
}
