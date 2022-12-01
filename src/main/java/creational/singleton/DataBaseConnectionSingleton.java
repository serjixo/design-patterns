package creational.singleton;

import java.util.Objects;

public class DataBaseConnectionSingleton {
    private static DataBaseConnection dataBaseConnection;


    private DataBaseConnectionSingleton(DataBaseConnection dataBaseConnection) {
        DataBaseConnectionSingleton.dataBaseConnection = dataBaseConnection;
    }

    public static DataBaseConnection getDataBaseConnection() {

        return Objects.requireNonNullElseGet(dataBaseConnection, () -> dataBaseConnection = new DataBaseConnection(DBState.ON));

    }
}
