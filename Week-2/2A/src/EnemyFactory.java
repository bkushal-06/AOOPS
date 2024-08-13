// EnemyFactory.java
public class EnemyFactory {
    public static Enemy createEnemy() {
        GameState gameState = GameState.getInstance();
        if (gameState.getDifficulty() > 5) {
            return new HardEnemy();
        } else {
            return new EasyEnemy();
        }
    }
}
