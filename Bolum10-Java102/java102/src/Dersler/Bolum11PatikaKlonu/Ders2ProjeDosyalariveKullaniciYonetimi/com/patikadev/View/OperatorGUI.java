package Dersler.Bolum11PatikaKlonu.Ders2ProjeDosyalariveKullaniciYonetimi.com.patikadev.View;

import Dersler.Bolum11PatikaKlonu.Ders2ProjeDosyalariveKullaniciYonetimi.com.patikadev.Helper.*;
import Dersler.Bolum11PatikaKlonu.Ders2ProjeDosyalariveKullaniciYonetimi.com.patikadev.Model.Operator;
import Dersler.Bolum11PatikaKlonu.Ders2ProjeDosyalariveKullaniciYonetimi.com.patikadev.Model.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class OperatorGUI extends JFrame {

    private JPanel wrapper;
    private JTabbedPane tab_operator;
    private JLabel lbl_welcome;
    private JPanel pnl_top;
    private JButton btn_logout;
    private JPanel pnl_user_list;
    private JScrollPane scrl_user_list;
    private JTable tbl_user_list;

    private DefaultTableModel mdl_user_list;
    private Object row_user_list;

    private final Operator operator;

    public OperatorGUI(Operator operator) {
        this.operator = operator;

        createLayout();
    }

    private void createLayout() {
        add(wrapper);
        setSize(1000, 500);
        setLocation(Helper.screenCenterPoint("x", getSize()), Helper.screenCenterPoint("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        this.lbl_welcome.setText("Hoşgeldiniz => " + this.operator.getName());

        // ModelUserList
        mdl_user_list = new DefaultTableModel();
        Object[] col_user_list = {"ID", "Ad Soyad", "Kullanıcı Adı", "Şifre", "Üyelik Tipi"};
        mdl_user_list.setColumnIdentifiers(col_user_list);
        /*Object[] firstRow = {"1", "Muaz", "muaz", "123", "operator"};
        mdl_user_list.addRow(firstRow);*/

        for (User user : User.getList()) {
            Object[] row = new Object[col_user_list.length];
            row[0] = user.getId();
            row[1] = user.getName();
            row[2] = user.getUsername();
            row[3] = user.getPass();
            row[4] = user.getType();

            mdl_user_list.addRow(row);
        }

        tbl_user_list.setModel(mdl_user_list);
        tbl_user_list.getTableHeader().setReorderingAllowed(false); // Sütun başlıklarının yerini değiştirme.
    }

    public static void main(String[] args) {
        Helper.setLayout();

        Operator operator = new Operator();
        operator.setId(1);
        operator.setName("Muaz Memiş");
        operator.setUsername("muaz");
        operator.setPass("1234");
        operator.setType("operator");

        OperatorGUI opGUI = new OperatorGUI(operator);
    }
}
