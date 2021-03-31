package reuse_class.constructor_with_parameters;


public class WithFinals {
    private final void f(){
        System.out.println("WithFinal.f()");
    }
    private void g(){
        System.out.println("g()方法");
    }
}
class OverridingPrivate extends WithFinals {
    private final void f(){
        System.out.println("重写的方法f()");
    }
    private void g(){
        System.out.println("重写的方法g()");
    }
}
class OverridingPrivate2 extends OverridingPrivate{

    public final void f(){
        System.out.println("重写的方法f2");
    }
    public void g(){
        System.out.println("重写的方法g2");
    }
}
class wojiu{
    public static void main(String[] args) {
        OverridingPrivate2 aa = new OverridingPrivate2();
        aa.f();
        aa.g();
        OverridingPrivate bb = aa;
        //你将无法调用方法
    }
}
