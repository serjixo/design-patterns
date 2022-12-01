package creational.factory;

public abstract class EnemyShip {
    private String shipName;
    private int damage;

    public EnemyShip(String shipName, int damage) {
        this.shipName = shipName;
        this.damage = damage;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
