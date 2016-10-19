package easytarget.storage;

/**
 *
 * @author Carabali Rivera Juan Pablo.
 */
public class Player {
    private int id;
    private String user;
    private String name;
    private int score;
    private Game game;

    // Constructor
    public Player() {}
    
    // Constructor sobrecargado
    public Player(int id, String user, String name, int score, Game game) {
        this.id = id;
        this.user = user;
        this.name = name;
        this.score = score;
        this.game = game;
    }

    public int getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Game getGame() {
        return game;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setGame(Game game) {
        this.game = game;
    }
    
}
