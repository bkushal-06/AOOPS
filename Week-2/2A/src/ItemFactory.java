// ItemFactory.java
public class ItemFactory {
    public static Weapon createWeapon() {
        GameState gameState = GameState.getInstance();
        if (gameState.getDifficulty() > 5) {
            return new Laser();
        } else {
            return new Sword();
        }
    }

    public static PowerUp createPowerUp() {
        GameState gameState = GameState.getInstance();
        if (gameState.getDifficulty() > 5) {
            return new Shield();
        } else {
            return new HealthPack();
        }
    }
}
