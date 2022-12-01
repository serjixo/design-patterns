package creational.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EnemyShipTest {

    @Test
    public void shouldCreateSilverSpaceShip(){
        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
        EnemyShip silverSpaceShip = enemyShipFactory.createSilverEnemyShip();
        Assertions.assertInstanceOf(SilverSpaceShip.class, silverSpaceShip);
    }

    @Test
    public void shouldCreateDarkSpaceShip(){
        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
        EnemyShip darkSpaceShip = enemyShipFactory.createDarkEnemyShip();
        Assertions.assertInstanceOf(DarkSpaceShip.class, darkSpaceShip);
    }


}