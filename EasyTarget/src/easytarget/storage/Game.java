package easytarget.storage;

/**
 *
 * @author Carabali Rivera Juan Pablo.
 */
public class Game {
    public int id;
    private int score;

    // Constructor
    public Game(){}

    // Constructor sobrecargado
    public Game(int id, int score) {
        this.id = id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
}
 