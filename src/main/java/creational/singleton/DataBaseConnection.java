package creational.singleton;

public class DataBaseConnection {
    private final DBState dbState;

    public DataBaseConnection(DBState dbState) {
        this.dbState = dbState;
    }

    public DBState getDbState() {
        return dbState;
    }

}
