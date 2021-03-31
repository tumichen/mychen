package internal_class;

public class DotThis {

    void f(){
        System.out.println("DotThis.f");
    }

    public class Inner{
        public DotThis outer(){
            return DotThis.this;
        }
    }

    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        //1.8之后好像不需要这样写了吧
        DotThis.Inner inner = dt.inner();
    }

}
