package test_interface;

public class Waveform {
    public static long counter;
    public static final long id = counter++;

    @Override
    public String toString() {
        return "Waveform"+id;
    }
}
class Filter{
    public String name(){
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input){
        return input;
    }
}
class LowPass extends Filter{
    double cutoff;
    public LowPass(double cutoff){
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
class HighPass extends Filter{
    double cutoff;
    public HighPass(double cutoff){
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
class BandPass extends Filter{
    double lowCutoff,highCutoff;
    public BandPass(double lowCutoff,double highCutoff){
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}