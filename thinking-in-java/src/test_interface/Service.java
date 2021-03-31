package test_interface;

interface Service {
    void method1();

    void method2();
}

interface ServiceFactory {
    Service getServvice();
}

class Implementation1 implements Service {
    @Override
    public void method1() {
        System.out.println("Implementation1.method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation1.method2");
    }
}

class ImplementationFactory implements ServiceFactory {

    @Override
    public Service getServvice() {
        return new Implementation1();
    }

}

class Implementation2 implements Service {


    @Override
    public void method1() {
        System.out.println("Implementation2.method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation2.method2");
    }
}

class Implementation2Factory implements ServiceFactory {

    @Override
    public Service getServvice() {
        return new Implementation2();
    }
}

class Factories {

    public static void serviceConsume(ServiceFactory factory) {
        Service servvice = factory.getServvice();
        servvice.method1();
        servvice.method2();
    }

    public static void main(String[] args) {
        serviceConsume(new ImplementationFactory());
        serviceConsume(new Implementation2Factory());
    }

}
