package Dersler.Bolum11PatikaKlonu.Ders2PatikaKlon.com.patikadev.View;

import Dersler.Bolum11PatikaKlonu.Ders2PatikaKlon.com.patikadev.Helper.Config;
import Dersler.Bolum11PatikaKlonu.Ders2PatikaKlon.com.patikadev.Helper.Helper;
import Dersler.Bolum11PatikaKlonu.Ders2PatikaKlon.com.patikadev.Model.Operator;
import Dersler.Bolum11PatikaKlonu.Ders2PatikaKlon.com.patikadev.Model.User;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OperatorGUI extends JFrame {

    private JPanel wrapper;
    private JTabbedPane tab_operator;
    private JLabel lbl_welcome;
    private JPanel pnl_top;
    private JButton btn_logout;
    private JPanel pnl_user_list;
    private JScrollPane scrl_user_list;
    private JTable tbl_user_list;
    private JPanel pnl_user_form;
    private JTextField fld_name;
    private JTextField fld_username;
    private JPasswordField fld_password;
    private JComboBox cmb_user_type;
    private JButton btn_user_add;
    private JTextField fld_user_id;
    private JButton btn_user_delete;
    private JTextField fld_search_user_name;
    private JTextField fld_search_user_username;
    private JComboBox cmb_search_user_type;
    private JButton btn_user_search;

    private DefaultTableModel mdl_user_list;
    private Object[] row_user_list;

    private final Operator operator;

    public OperatorGUI(Operator operator) {
        this.operator = operator;
        createLayout();
        userAdd();
        userDelete();
        userUpdate();
        userSearch();
        logout();
    }

    private void userSearch() {
        btn_user_search.addActionListener(e -> {
            String name = fld_search_user_name.getText();
            String username = fld_search_user_username.getText();
            String type = cmb_search_user_type.getSelectedItem().toString();

            String query = User.searchQuery(name, username, type);
            getAllUser(User.searchUserList(query));

        });
    }

    private void logout() {
        btn_logout.addActionListener(e -> {
            dispose();
        });
    }

    private void createLayout() {
        add(wrapper);
        setSize(1000, 500);
        setLocation(Helper.screenCenterPoint("x", getSize()), Helper.screenCenterPoint("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        this.lbl_welcome.setText("Hoşgeldiniz => " + this.operator.getName());

        getAllUser();
    }

    private void getAllUser() {
        mdl_user_list = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0) { // id alanının değiştirilmesini engeller.
                    return false;
                }
                return super.isCellEditable(row, column);
            }
        };

        Object[] col_user_list = {"ID", "Ad Soyad", "Kullanıcı Adı", "Şifre", "Üyelik Tipi"};
        mdl_user_list.setColumnIdentifiers(col_user_list);
        row_user_list = new Object[col_user_list.length];

        for (User user : User.getList()) {
            int i = 0;
            row_user_list[i++] = user.getId();
            row_user_list[i++] = user.getName();
            row_user_list[i++] = user.getUsername();
            row_user_list[i++] = user.getPass();
            row_user_list[i++] = user.getType();

            mdl_user_list.addRow(row_user_list);
        }

        tbl_user_list.setModel(mdl_user_list);
        tbl_user_list.getTableHeader().setReorderingAllowed(false); // Sütun başlıklarının yerini değiştirmeyi engeller.

    }

    private void getAllUser(ArrayList<User> list) {
        mdl_user_list = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0) { // id alanının değiştirilmesini engeller.
                    return false;
                }
                return super.isCellEditable(row, column);
            }
        };

        Object[] col_user_list = {"ID", "Ad Soyad", "Kullanıcı Adı", "Şifre", "Üyelik Tipi"};
        mdl_user_list.setColumnIdentifiers(col_user_list);
        row_user_list = new Object[col_user_list.length];

        for (User user : list) {
            int i = 0;
            row_user_list[i++] = user.getId();
            row_user_list[i++] = user.getName();
            row_user_list[i++] = user.getUsername();
            row_user_list[i++] = user.getPass();
            row_user_list[i++] = user.getType();

            mdl_user_list.addRow(row_user_list);
        }

        tbl_user_list.setModel(mdl_user_list);
        tbl_user_list.getTableHeader().setReorderingAllowed(false); // Sütun başlıklarının yerini değiştirmeyi engeller.

    }

    private void userAdd() {
        ArrayList<JTextField> fields = new ArrayList<>();
        fields.add(fld_name);
        fields.add(fld_username);
        fields.add(fld_password);

        btn_user_add.addActionListener(e -> {
            if (Helper.isFieldEmpty(fields)) {
                Helper.showMessage("fill");
            } else {
                if (User.add(fld_name.getText(), fld_username.getText(), fld_password.getText(),
                        cmb_user_type.getSelectedItem().toString())) {
                    getAllUser();

                    fld_name.setText(null);
                    fld_username.setText(null);
                    fld_password.setText(null);

                    Helper.showMessage("done");
                }
            }
        });
    }

    private void userUpdate() {
        tbl_user_list.getModel().addTableModelListener(e -> {
            if (e.getType() == TableModelEvent.UPDATE) {
                int user_id = Integer.parseInt(tbl_user_list.getValueAt(tbl_user_list.getSelectedRow(), 0)
                        .toString());
                String user_name = tbl_user_list.getValueAt(tbl_user_list.getSelectedRow(), 1).toString();
                String user_username = tbl_user_list.getValueAt(tbl_user_list.getSelectedRow(), 2).toString();
                String user_pass = tbl_user_list.getValueAt(tbl_user_list.getSelectedRow(), 3).toString();
                String user_type = tbl_user_list.getValueAt(tbl_user_list.getSelectedRow(), 4).toString();

                if (User.update(user_id, user_name, user_username, user_pass, user_type)) {
                    Helper.showMessage("done");
                }

                getAllUser();
            }
        });
    }

    private void userDelete() {
        tbl_user_list.getSelectionModel().addListSelectionListener(e -> {
            try {
                String select_user_id = tbl_user_list.getValueAt(tbl_user_list.getSelectedRow(), 0).toString();
                fld_user_id.setText(select_user_id);
            } catch (Exception exception) {
            }
        });

        btn_user_delete.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_user_id)) {
                Helper.showMessage("fill");
            } else {
                int user_id = Integer.parseInt(fld_user_id.getText());
                if (User.delete(user_id)) {
                    getAllUser();
                    Helper.showMessage("done");
                } else {
                    Helper.showMessage("error");
                }
            }
        });
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
