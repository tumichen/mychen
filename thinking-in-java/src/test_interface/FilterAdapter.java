package test_interface;

public class FilterAdapter implements Processor {
    Filter filter;
    public FilterAdapter(Filter filter){
        this.filter = filter;
    }
    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform)input);
    }
}
class FilterProcessor{
    public static void main(String[] args) {
        Waveform w = new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)),w);
        Apply.process(new FilterAdapter(new LowPass(2.0)),w);
        Apply.process(new FilterAdapter(new LowPass(3.0)),w);
    }
}
