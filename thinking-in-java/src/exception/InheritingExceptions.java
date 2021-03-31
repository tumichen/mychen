package exception;
class SimpleException extends Exception{}
public class InheritingExceptions {
    public void f() throws SimpleException {
        System.out.println("Throw new InheritingExceptions.f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions inh = new InheritingExceptions();
        try {
            inh.f();
        } catch (SimpleException e) {
            System.out.println("caugh it");
        }
    }
}
