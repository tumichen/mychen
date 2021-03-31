package internal_class;

public class Parcel1 {
    class Contents{
        private int i = 11;
        public int value(){
            return i;
        }
    }
    class Destination{
        private String label;
        Destination(String whereto){
            this.label = whereto;
        }
        String readLabel(){
            return label;
        }
    }

    public void ship(String dest){

        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("迪丽热巴");
    }

}
