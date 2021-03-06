package Dersler.Bolum11PatikaKlonu.Ders2PatikaKlon.com.patikadev.Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    private Connection connect = null;

    private Connection connectDB() {
        try {
            this.connect = DriverManager.getConnection(Config.DB_URL, Config.DB_USERNAME, Config.DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return this.connect;
    }

    public static Connection getInstance() {
        DBConnector db = new DBConnector();
        return db.connectDB();
    }

}
