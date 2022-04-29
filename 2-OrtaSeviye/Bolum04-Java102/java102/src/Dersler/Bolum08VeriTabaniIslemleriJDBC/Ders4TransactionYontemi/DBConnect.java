package Dersler.Bolum08VeriTabaniIslemleriJDBC.Ders4TransactionYontemi;

import java.sql.*;

public class DBConnect {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/univercity";
    private static final String DB_USERNAME = "postgres";
    private static final String DB_PASSWORD = "togg";

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        connection.setAutoCommit(false);

        PreparedStatement pr = connection.prepareStatement("INSERT INTO student (student_name, student_class) VALUES (?, ?)");
        pr.setString(1, "Jhon");
        pr.setInt(2, 1);
        pr.executeUpdate();

        if (true) {
            throw new SQLException();
        }

        pr.setString(1, "Doe");
        pr.setInt(2, 3);
        pr.executeUpdate();

        connection.commit();
        pr.close();
        connection.close();
    }
}
