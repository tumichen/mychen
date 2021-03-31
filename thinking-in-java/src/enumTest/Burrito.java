package enumTest;


public class Burrito {
    Spiciness degree;
    public Burrito(Spiciness degree){
        this.degree=degree;
    }

    @Override
    public String toString() {
        return "Burrito{" +
                "degree=" + degree +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new Burrito(Spiciness.HOT));
    }
}
