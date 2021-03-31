package internal_class;



public class Parcel2 {

    class Contents{
        private int i = 11;
        public int value(){
            return i;
        }
    }
    class Destination{
        private String label;
        Destination(String whereTo){
            this.label = whereTo;
        }
        String readLeable(){
            return label;
        }
    }
    public Destination to(String s){
        return new Destination(s);
    }
    public Contents contents(){
        return new Contents();
    }
    public void ship(String dest){
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readLeable());
    }

    public static void main(String[] args) {
        Parcel2 parcel2 = new Parcel2();
        parcel2.ship("迪丽热巴");
        Parcel2 p = new Parcel2();
        Parcel2.Contents c = p.contents();
        Parcel2.Destination d = p.to("古力娜扎");
    }
}
