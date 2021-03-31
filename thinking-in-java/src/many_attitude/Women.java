package many_attitude;

class Women {
    public void makeLove(){
        System.out.println("我是女人来干我吧");
    }
}
class dilireba extends Women{
    @Override
    public void makeLove() {
        System.out.println("我是迪丽热巴,来干我吧");
    }
}
class gulinazha extends Women{
    @Override
    public void makeLove() {
        System.out.println("我是古力娜扎,来干我吧");
    }
}
class Man{
    private Women women = new dilireba();
    public void huanRen(){
        System.out.println("换一个口味");
        women = new gulinazha();
    }
    public void kaiGan(){
        women.makeLove();
    }
}
class daoYan{
    public static void main(String[] args) {
        Man man = new Man();
        man.kaiGan();
        man.huanRen();
        man.kaiGan();
    }
}
