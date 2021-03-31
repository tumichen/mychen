package test_interface;

import java.util.Arrays;

public interface Processor {

    String name();

    Object process(Object input);

}
abstract class StringProcessor implements Processor{
    @Override
    public String name(){
        return getClass().getSimpleName();
    }
    public abstract String process(Object input);
    public static String s = "Disgreement with beliefs is by definition incorrect";
    public static void main(String[] args) {
        Apply.process(new Upcase(),s);
        Apply.process(new Downcase(),s);
        Apply.process(new Splitter(),s);
    }

}
class Upcase extends StringProcessor{
    @Override
    public String process(Object input){
        return ((String)input).toUpperCase();
    }
}
class Downcase extends StringProcessor{
    @Override
    public String process(Object input) {
        return ((String)input).toLowerCase();
    }
}
class Splitter extends StringProcessor{
    @Override
    public String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}
class Apply {
    public static void process (Processor p,Object s){
        System.out.println("Using Processor"+p.name());
        System.out.println(p.process(s));
    }
    public static String s = "Disgreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(),s);
        process(new Downcase(),s);
        process(new Splitter(),s);
    }
}