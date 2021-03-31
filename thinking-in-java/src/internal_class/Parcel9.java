package internal_class;

public class Parcel9 {

    public Destination destination(final String dest){
        return new Destination() {
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination destination = p.destination("迪丽热巴");
    }

}
