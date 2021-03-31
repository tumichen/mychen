package internal_class;

public class Parcel3 {
    class Contents{
        private int i = 11;
        private int value(){
            return i;
        }
    }
    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLable(){
            return label;
        }
    }

    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        //Contents contents = new Contents();
        //必须使用外部实例来创建内部实例
        Contents contents = p.new Contents();
        Destination destination = p.new Destination("迪丽热巴");
        String s = destination.readLable();
        System.out.println(s);
    }
}
