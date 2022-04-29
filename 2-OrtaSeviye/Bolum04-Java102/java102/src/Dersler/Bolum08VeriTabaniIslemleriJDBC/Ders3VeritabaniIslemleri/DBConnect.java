package Dersler.Bolum08VeriTabaniIslemleriJDBC.Ders3VeritabaniIslemleri;

import java.sql.*;

public class DBConnect {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/univercity";
    //    private static final String DB_URL = "jdbc:postgresql://localhost:5432/patika";
    private static final String DB_USERNAME = "postgres";
    private static final String DB_PASSWORD = "togg";

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        Statement st = connection.createStatement();
//        Statement st = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//        String sql = "SELECT * FROM student";
//        ResultSet data = st.executeQuery(sql);

        /*String sql = "SELECT * FROM public.\"user\"";
        ResultSet data = st.executeQuery(sql);

        while (data.next()) {
            System.out.println("ID : " + data.getInt("id"));
            System.out.println("Name : " + data.getString("name"));
            System.out.println("UserName : " + data.getString("username"));
            System.out.println("Password : " + data.getString("pass"));
            System.out.println("Type : " + data.getString("type"));
            System.out.println("******************");
        }*/

        /*while (data.next()) {
            System.out.println("ID : " + data.getInt("student_id"));
            System.out.println("Adı : " + data.getString("student_name"));
            System.out.println("Sınıfı : " + data.getInt("student_class"));
            System.out.println("******************");
        }*/

        /*data.next();
        data.next();
        data.first();
        data.last();
        data.absolute(3);
        System.out.println(data.getString("student_name"));*/
/*
        String sql = "INSERT INTO student (student_name, student_class) VALUES ('Mehmet', 3)";
        String prSql = "INSERT INTO student (student_name, student_class) VALUES (? , ?)";

//        System.out.println(st.executeUpdate(sql));

        PreparedStatement prSt = connection.prepareStatement(prSql);
        prSt.setString(1, "Ahmet");
        prSt.setInt(2, 4);
        prSt.executeUpdate();
        prSt.close();*/


        /*String sqlUpdate = "UPDATE student SET student_name = 'Mahmut Çetindağ' WHERE student_id = 1";
        String prSqlUpdate = "UPDATE student SET student_name = ? WHERE student_id = ?";

//        st.executeUpdate(sqlUpdate);

        PreparedStatement pr = connection.prepareStatement(prSqlUpdate);
        pr.setString(1, "Maho Ağa");
        pr.setInt(2, 1);
        pr.executeUpdate();*/


        /*String sqlDelete = "DELETE FROM student WHERE student_id = 4";
        String prSqlDelete = "DELETE FROM student WHERE student_id = ?";

        st.executeUpdate(sqlDelete);

        PreparedStatement pr = connection.prepareStatement(prSqlDelete);
        pr.setInt(1, 3);
        pr.executeUpdate();*/

        connection.close();
    }
}
