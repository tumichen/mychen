package test_interface;

class A {
    interface B{
        void f();
    }
    public class Bimp implements B{

        @Override
        public void f() {

        }
    }
    private class Bimp2 implements B{

        @Override
        public void f() {

        }
    }
    public interface C{
        void f();
    }
    class Cimp implements C{

        @Override
        public void f() {

        }
    }
    private class Cimp2 implements C{

        @Override
        public void f() {

        }
    }

    private interface D{
        void f();
    }

    private class DImp implements D{

        @Override
        public void f() {

        }
    }

    public class Dimp2 implements D{

        @Override
        public void f() {

        }
    }

    public D getD(){
        return new Dimp2();
    }

    private D dRef;

    public void receiveD(D d){
        dRef = d;
        dRef.f();
    }
}
