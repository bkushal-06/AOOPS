// Main.java
public class Main {
    public static void main(String[] args) {
        // Set game difficulty
        GameState gameState = GameState.getInstance();
        gameState.setDifficulty(7); // Set difficulty to Hard

        // Create and use enemies
        Enemy enemy = EnemyFactory.createEnemy();
        enemy.attack();

        // Create and use weapons and power-ups
        Weapon weapon = ItemFactory.createWeapon();
        PowerUp powerUp = ItemFactory.createPowerUp();

        weapon.use();
        powerUp.activate();
    }
}
