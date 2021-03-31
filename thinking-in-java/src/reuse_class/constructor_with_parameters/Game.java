package reuse_class.constructor_with_parameters;

public class Game {
    Game(int i){
        System.out.println("Game constructoe");
    }
}
class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("boardGame");
    }
}

