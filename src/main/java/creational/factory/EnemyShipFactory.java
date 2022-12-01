package creational.factory;

public class EnemyShipFactory {
    public EnemyShip createSilverEnemyShip() {
        return new SilverSpaceShip();
    }

    public EnemyShip createDarkEnemyShip() {
        return new DarkSpaceShip();
    }

}
