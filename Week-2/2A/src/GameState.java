// GameState.java
public class GameState {
    private static GameState instance;
    private int difficulty;

    private GameState() {
        // Private constructor to prevent instantiation
    }

    public static GameState getInstance() {
        if (instance == null) {
            instance = new GameState();
        }
        return instance;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
}
