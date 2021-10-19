package Dersler.Bolum11PatikaKlonu.Ders2PatikaKlon.com.patikadev.Model;

import Dersler.Bolum11PatikaKlonu.Ders2PatikaKlon.com.patikadev.Helper.DBConnector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Patika {
    private int id;
    private String name;

    private Patika() {

    }

    public Patika(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ArrayList<Patika> getList() {
        ArrayList<Patika> patikaList = new ArrayList<>();
        Patika patika;
        String query = "SELECT * FROM patika";

        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                patika = new Patika(rs.getInt("id"), rs.getString("name"));
                patikaList.add(patika);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return patikaList;
    }

    public static boolean add(String name) {
        String query = "INSERT INTO patika (name) VALUES (?)";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1, name);
            return pr.executeUpdate() != -1;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return true;
    }

    public static boolean update(int id, String name) {
        String query = "UPDATE patika SET name = ? WHERE id = ?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1, name);
            pr.setInt(2, id);
            return pr.executeUpdate() != -1;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return true;
    }

    public static boolean delete(int id) {
        String query = "DELETE FROM patika WHERE id = ?";
        ArrayList<Course> courseList = Course.getList();
        for (Course course : courseList) {
            if (course.getPatika().getId() == id) {
                Course.delete(course.getId());
            }
        }
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, id);
            return pr.executeUpdate() != -1;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return true;
    }

    public static Patika getFetchById(int id) {
        Patika patika = null;
        String query = "SELECT * FROM patika WHERE id = ?";

        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, id);
            ResultSet rs = pr.executeQuery(); // executeQuery içine query almaz!!
            if (rs.next()) {
                patika = new Patika(rs.getInt("id"), rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return patika;
    }

}
