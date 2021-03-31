package internal_class;

public class Parcel5 {
    public Destination destiantion(String s) {

        //一个局部内部类,
        class PDestination implements Destination {

            private String label;

            private PDestination(String whereTo) {
                this.label = whereTo;
            }

            @Override
            public String readLabel() {
                return null;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 parcel5 = new Parcel5();
        Destination destiantion = parcel5.destiantion("迪乐热巴");
    }

}
