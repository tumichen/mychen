package many_attitude;

class Useful {
    public void f(){}
    public void g(){}
}
class MoreUseful extends Useful{
    @Override
    public void f() {

    }

    @Override
    public void g() {

    }
    public void h(){}
    public void j(){}
    public void k(){}
}
class RTTi{
    public static void main(String[] args) {
        Useful[] x = {new Useful(),new MoreUseful()};
        x[0].f();
        x[1].g();
        ((MoreUseful)x[1]).f();
        ((MoreUseful)x[0]).f();
    }
}