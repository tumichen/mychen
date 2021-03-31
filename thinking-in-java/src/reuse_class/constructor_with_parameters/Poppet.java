package reuse_class.constructor_with_parameters;

class Poppet {
    private int i;
    Poppet(int ii){
        i=ii;
    }
}
class BlankFinal{
    private final int i = 0;
    private final int j;//Blank final
    private final Poppet p;//Blank final reference
    //Blank finals must be initialized in the constructor
    BlankFinal(){
        j =1;
        p = new Poppet(11);//initialize
    }
    BlankFinal(int x){
        j = x;
        p = new Poppet(x);
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(1);
    }
}
