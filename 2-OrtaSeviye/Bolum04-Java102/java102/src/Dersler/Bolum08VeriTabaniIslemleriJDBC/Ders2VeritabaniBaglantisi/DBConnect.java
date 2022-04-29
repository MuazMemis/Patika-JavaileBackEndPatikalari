package Dersler.Bolum08VeriTabaniIslemleriJDBC.Ders2VeritabaniBaglantisi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/univercity";
    private static final String DB_USERNAME = "postgres";
    private static final String DB_PASSWORD = "togg";

    public static void main(String[] args) {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("Veritabanına Bağlandınız.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
