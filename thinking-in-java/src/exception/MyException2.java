package exception;

public class MyException2 extends Exception {
    private int x;

    public MyException2() {
    }

    public MyException2(String msg) {
        super(msg);
    }

    public MyException2(String msg, int x) {
        super(msg);
        this.x = x;
    }
    public int val(){
        return x;
    }
    public String getMessage(){
        return "Detail Message: "+ x +" " +super.getMessage();
    }
}
class ExtraFeatures{
    public static void f() throws MyException2 {
        System.out.println("Throwing MyException2 from f()");
        throw new MyException2();
    }
    public static void g() throws MyException2 {
        System.out.println("ExtraFeatures.g");
        throw new MyException2("Originated in g()");
    }
    public static void h() throws MyException2 {
        System.out.println("ExtraFeatures.h");
        throw new MyException2("Originated in h()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException2 myException2) {
            myException2.printStackTrace(System.out);
        }
        try {
            g();
        } catch (MyException2 myException2) {
            myException2.printStackTrace(System.out);
        }
        try {
            h();
        } catch (MyException2 myException2) {
            myException2.printStackTrace(System.out);
        }
    }
}
