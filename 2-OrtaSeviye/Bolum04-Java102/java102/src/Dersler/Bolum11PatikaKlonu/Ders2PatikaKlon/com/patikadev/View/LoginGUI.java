package Dersler.Bolum11PatikaKlonu.Ders2PatikaKlon.com.patikadev.View;

import Dersler.Bolum11PatikaKlonu.Ders2PatikaKlon.com.patikadev.Helper.Config;
import Dersler.Bolum11PatikaKlonu.Ders2PatikaKlon.com.patikadev.Helper.Helper;
import Dersler.Bolum11PatikaKlonu.Ders2PatikaKlon.com.patikadev.Model.Operator;
import Dersler.Bolum11PatikaKlonu.Ders2PatikaKlon.com.patikadev.Model.User;

import javax.swing.*;

public class LoginGUI extends JFrame {
    private JPanel wrapper;
    private JPanel wtop;
    private JPanel wbottom;
    private JTextField fld_user_username;
    private JPasswordField fld_user_pass;
    private JLabel lbl_user_pass;
    private JButton btn_login;

    public LoginGUI() {
        add(wrapper);
        setSize(400, 400);
        setLocation(Helper.screenCenterPoint("x", getSize()), Helper.screenCenterPoint("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);

        btn_login.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_user_username) || Helper.isFieldEmpty(fld_user_pass)) {
                Helper.showMessage("fill");
            } else {
                User user = User.getFecth(fld_user_username.getText(), fld_user_pass.getText());
                if (user == null) {
                    Helper.showMessage("Kullanıcı bulunamadı.");
                } else {
                    switch (user.getType()) {
                        case "operator":
                            OperatorGUI operatorGUI = new OperatorGUI((Operator) user);
                            break;
                        case "educator":
                            EducatorGUI educatorGUI = new EducatorGUI();
                            break;
                        case "student":
                            StudentGUI studentGUI = new StudentGUI();
                            break;
                    }

                    dispose();
                }
            }
        });
    }

    public static void main(String[] args) {
        Helper.setLayout();
        LoginGUI loginGUI = new LoginGUI();

    }
}
