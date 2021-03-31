package internal_class;

public interface Destination {
    String readLabel();
}
interface Contents{
    int value();
}
class Parcel4{
    private class Pcontents implements Contents{
        private int i =11;
        @Override
        public int value() {
            return 0;
        }
    }
    protected class Pdestination implements Destination{
        private String label;

        private Pdestination(String whereTo) {
            this.label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }
    public Destination destination(String s){
        return new Pdestination(s);
    }
    public Contents contents(){
        return new Pcontents();
    }

}
class TestParcel{
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents contents = p.contents();
        Destination destination = p.destination("迪丽热巴");
        //p.new Pcontents();
    }
}

