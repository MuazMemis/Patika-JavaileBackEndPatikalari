package Dersler.Bolum11PatikaKlonu.Ders2PatikaKlon.com.patikadev.Model;

import Dersler.Bolum11PatikaKlonu.Ders2PatikaKlon.com.patikadev.Helper.DBConnector;
import Dersler.Bolum11PatikaKlonu.Ders2PatikaKlon.com.patikadev.Helper.Helper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private String username;
    private String pass;
    private String type;

    public User() {
    }

    public User(String name, String username, String pass, String type) {
        this.name = name;
        this.username = username;
        this.pass = pass;
        this.type = type;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static ArrayList<User> getList() {
        ArrayList<User> userList = new ArrayList<>();
        String query = "SELECT * FROM public.user";
        User obj;
        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                obj = new User();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setUsername(rs.getString("username"));
                obj.setPass(rs.getString("pass"));
                obj.setType(rs.getString("type"));

                userList.add(obj);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userList;
    }

    public static boolean add(String name, String username, String pass, String type) {
        String query = "INSERT INTO public.user (name, username, pass, type) VALUES (?, ?, ?, ?)";
        User findUser = User.getFecthByUserName(username);
        if (findUser != null) {
            Helper.showMessage("Kullanıcı adı mevcut!");
            return false;
        }

        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1, name);
            pr.setString(2, username);
            pr.setString(3, pass);
            pr.setString(4, type);

            int response = pr.executeUpdate();
            if (response == -1) {
                Helper.showMessage("error");
            }
            return response != -1;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return true;

    }

    public static boolean delete(int id) {
        String query = "DELETE FROM public.user WHERE id = ?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1, id);
            return pr.executeUpdate() != -1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return true;
    }

    public static User getFecthByUserName(String userName) {
        User user = null;
        String query = "SELECT * FROM public.user WHERE username = ?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1, userName);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setUsername(rs.getString("username"));
                user.setPass(rs.getString("pass"));
                user.setType(rs.getString("type"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return user;

    }

}
