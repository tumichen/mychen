package possess_object;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}

public class AslistInference {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Powder(),new Crusty(),new Slush());
        List<Snow> snow2 = Arrays.asList(new Light(),new heavy());
        Iterator<Snow> iterator = snow1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
