package many_attitude;

class Test {
    public int a;
    public int c;
}
class Test2 extends Test{
    public int a;
}
class Client{
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.a=18;
        Test test = new Test();
        System.out.println(test.a);
    }
}
