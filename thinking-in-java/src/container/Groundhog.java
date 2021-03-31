package container;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Random;

public class Groundhog {
    private int number;

    public Groundhog(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Groundhog{" +
                "number=" + number +
                '}';
    }
}
class Prediction{
    private static Random random = new Random(47);
    private boolean shadow = random.nextDouble()>0.5;

    @Override
    public String toString() {
        if (shadow){
            return "Six more weeks of Winter";
        }else {
            return "Early Spring";
        }
    }
}
class StringDetector{
    public static <T extends Groundhog> void detecSpring(Class<T> type) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<T> groundhog = type.getConstructor(int.class);
        HashMap<Groundhog, Prediction> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(groundhog.newInstance(i),new Prediction());
        }
        System.out.println(map);
        Groundhog gh = groundhog.newInstance(3);
        System.out.println("Lookint up prediction for"+gh);
        if (map.containsKey(gh)){
            System.out.println(map.get(gh));
        }else {
            System.out.println("Key not found"+gh);
        }
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        detecSpring(Groundhog.class);
    }
}

