package Dersler.Bolum11PatikaKlonu.Ders2PatikaKlon.com.patikadev.View;

import Dersler.Bolum11PatikaKlonu.Ders2PatikaKlon.com.patikadev.Helper.Config;
import Dersler.Bolum11PatikaKlonu.Ders2PatikaKlon.com.patikadev.Helper.Helper;
import Dersler.Bolum11PatikaKlonu.Ders2PatikaKlon.com.patikadev.Model.Operator;
import Dersler.Bolum11PatikaKlonu.Ders2PatikaKlon.com.patikadev.Model.Patika;
import Dersler.Bolum11PatikaKlonu.Ders2PatikaKlon.com.patikadev.Model.User;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
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
    private JTextField fld_user_name;
    private JTextField fld_user_username;
    private JPasswordField fld_user_password;
    private JComboBox cmb_user_type;
    private JButton btn_user_add;
    private JTextField fld_user_id;
    private JButton btn_user_delete;
    private JTextField fld_search_user_name;
    private JTextField fld_search_user_username;
    private JComboBox cmb_search_user_type;
    private JButton btn_user_search;
    private JPanel pnl_patika_list;
    private JScrollPane scrll_patika_list;
    private JTable tbl_patika_list;
    private JPanel pnl_patika_add;
    private JTextField fld_patika_name;
    private JButton btn_patika_add;

    private DefaultTableModel mdl_user_list;
    private Object[] row_user_list;

    private DefaultTableModel mdl_patika_list;
    private Object[] row_patika_list;
    private JPopupMenu patikaMenu;

    private final Operator operator;

    public OperatorGUI(Operator operator) {
        this.operator = operator;
        createLayout();

        getAllUser();
        userAdd();
        userDelete();
        userUpdate();
        userSearch();

        createModelPatika();
        patikaAdd();

        logout();

    }

    private void createModelPatika() {
        createTablePatika();
        getAllPatika();
        patikaPopupMenu();
    }

    private void createTablePatika() {
        mdl_patika_list = new DefaultTableModel();
        Object[] col_patika_list = {"ID", "Patika Adı"};
        mdl_patika_list.setColumnIdentifiers(col_patika_list);
        row_patika_list = new Object[col_patika_list.length];

        tbl_patika_list.setModel(mdl_patika_list);
        tbl_patika_list.getTableHeader().setReorderingAllowed(false);
        tbl_patika_list.getColumnModel().getColumn(0).setMaxWidth(50);

    }

    private void patikaPopupMenu() {
        patikaMenu = new JPopupMenu();
        JMenuItem updateMenu = new JMenuItem("Güncelle");
        JMenuItem deleteMenu = new JMenuItem("Sil");
        patikaMenu.add(updateMenu);
        patikaMenu.add(deleteMenu);
        tbl_patika_list.setComponentPopupMenu(patikaMenu);

        patikaUpdate(updateMenu);
        patikaDelete(deleteMenu);
    }

    private void getAllPatika() {
        DefaultTableModel clearModel = (DefaultTableModel) tbl_patika_list.getModel();
        clearModel.setRowCount(0);

        int i;
        for (Patika patika : Patika.getList()) {
            i = 0;
            row_patika_list[i++] = patika.getId();
            row_patika_list[i++] = patika.getName();
            mdl_patika_list.addRow(row_patika_list);
        }

    }

    private void patikaAdd() {
        btn_patika_add.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_patika_name)) {
                Helper.showMessage("fill");
            } else {
                if (Patika.add(fld_patika_name.getText())) {
                    getAllPatika();
                    fld_patika_name.setText(null);
                    Helper.showMessage("done");
                } else {
                    Helper.showMessage("error");
                }
            }
        });
    }

    private void patikaUpdate(JMenuItem updateMenu) {
        tbl_patika_list.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Point point = e.getPoint();
                int selected_row = tbl_patika_list.rowAtPoint(point);
                tbl_patika_list.setRowSelectionInterval(selected_row, selected_row);
            }
        });

        updateMenu.addActionListener(e -> {
            int select_id = Integer.parseInt(tbl_patika_list.getValueAt(tbl_patika_list.getSelectedRow(), 0)
                    .toString());
            UpdatePatikaGUI updatePatikaGUI = new UpdatePatikaGUI(Patika.getFetchById(select_id));
            updatePatikaGUI.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    getAllPatika();
                }
            });
        });
    }

    private void patikaDelete(JMenuItem deleteMenu) {
        deleteMenu.addActionListener(e -> {
            if (Helper.confirm("sure")) {
                int select_id = Integer.parseInt(tbl_patika_list.getValueAt(tbl_patika_list.getSelectedRow(), 0)
                        .toString());
                if (Patika.delete(select_id)) {
                    getAllPatika();
                    Helper.showMessage("done");
                } else {
                    Helper.showMessage("error");
                }
            }
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

    private void userSearch() {
        btn_user_search.addActionListener(e -> {
            String name = fld_search_user_name.getText();
            String username = fld_search_user_username.getText();
            String type = cmb_search_user_type.getSelectedItem().toString();

            String query = User.searchQuery(name, username, type);
            getAllUser(User.searchUserList(query));

        });
    }

    private void userAdd() {
        ArrayList<JTextField> fields = new ArrayList<>();
        fields.add(fld_user_name);
        fields.add(fld_user_username);
        fields.add(fld_user_password);

        btn_user_add.addActionListener(e -> {
            if (Helper.isFieldEmpty(fields)) {
                Helper.showMessage("fill");
            } else {
                if (User.add(fld_user_name.getText(), fld_user_username.getText(), fld_user_password.getText(),
                        cmb_user_type.getSelectedItem().toString())) {
                    getAllUser();

                    fld_user_name.setText(null);
                    fld_user_username.setText(null);
                    fld_user_password.setText(null);

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
                if (Helper.confirm("sure")) {
                    int user_id = Integer.parseInt(fld_user_id.getText());
                    if (User.delete(user_id)) {
                        getAllUser();
                        Helper.showMessage("done");
                    } else {
                        Helper.showMessage("error");
                    }
                }
            }
        });
    }

    private void logout() {
        btn_logout.addActionListener(e -> {
            dispose();
        });
    }

}
