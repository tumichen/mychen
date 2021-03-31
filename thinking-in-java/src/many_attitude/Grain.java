package many_attitude;

class Grain {
    @Override
    public String toString() {
        return "Grainn";
    }
}
class Wheat extends Grain{
    @Override
    public String toString() {
        return "Wheat";
    }
}
class Mill{
    Grain process(){
        return new Grain();
    }
}
class WheatMill extends Mill{
    @Override
    Wheat process(){
        return new Wheat();
    }
}
class CovarianReturn{
    public static void main(String[] args) {
        Mill m = new Mill();
        Grain g = m.process();
        System.out.println(g);
        WheatMill w = new WheatMill();
        Wheat W1 = w.process();
        System.out.println(W1);
    }
}
