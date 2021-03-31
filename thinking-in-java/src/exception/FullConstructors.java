package exception;
class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }

    public MyException() {

    }
}
public class FullConstructors {
    public static void f() throws MyException {
        System.out.println("FullConstructors.f");
        throw new MyException();
    }
    public static void g() throws MyException {
        System.out.println("FullConstructors.g");
        throw new MyException();
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
    }
}
