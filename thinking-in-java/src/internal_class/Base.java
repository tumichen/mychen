package internal_class;

public abstract class Base {

    public Base(int i){
        System.out.println("Base.Base"+i);
    }
    public abstract void f();

}
class AnonyousConstructor{

    public static Base getBase(int i){
        return new Base(i) {
            {
                System.out.println("Inside instance initializer");
            }
            @Override
            public void f() {
                System.out.println("In anonyous f()");
            }
        };
    }


    public static void main(String[] args) {
        Base base = getBase(18);
        base.f();
    }

}