package test_interface;

class B{
    int i;
    public B(int i){
        this.i = i;
    }
}
public interface wojiuhehe {
    B B = new B(17);
}
class Dd implements wojiuhehe{

    public static void main(String[] args) {
        Dd dd = new Dd();
    }
}
