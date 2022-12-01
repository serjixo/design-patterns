package creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DataBaseConnectionTest {

    @Test
    public void shouldCreateIStanceStateON() {
        DataBaseConnection dataBaseConnection = DataBaseConnectionSingleton.getDataBaseConnection();
        DBState dbState = dataBaseConnection.getDbState();
        Assertions.assertEquals(dbState, DBState.ON);
    }

    @Test
    public void shouldCheckInstanceIsTheSame() {
        DataBaseConnection dataBaseConnection = DataBaseConnectionSingleton.getDataBaseConnection();
        DataBaseConnection dataBaseConnection2 = DataBaseConnectionSingleton.getDataBaseConnection();
        Assertions.assertEquals(dataBaseConnection, dataBaseConnection2);
    }

}
