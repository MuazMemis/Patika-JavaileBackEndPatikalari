package Dersler.Bolum11PatikaKlonu.Ders1JavaSwingGUIKullanimi.com.patikadev;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example extends JFrame {
    private JPanel wrapper;
    private JPanel wbottom;
    private JPanel wtop;
    private JTextField fld_username;
    private JPasswordField fld_password;
    private JButton btn_login;

    public Example() throws HeadlessException {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
//            System.out.println(info.getName() + " => " + info.getClassName());
            if ("Nimbus".equals(info.getName())) {
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
            }
        }

        setContentPane(this.wrapper);
        setSize(500, 300);
        setTitle("Uygulama Adı");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // close a basınca programı kapatır.
        setResizable(false);
        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - getSize().width) / 2;
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2;
        setLocation(x, y);
        setVisible(true);

        btn_login.addActionListener(e ->
        {
            System.out.println(fld_username.getText());
            System.out.println(fld_password.getPassword());
            if (fld_username.getText().length() == 0 || fld_password.getPassword().length == 0) {
                System.out.println("Tüm alanları doldurunuz.");
                JOptionPane.showMessageDialog(null, "Tüm alanları doldurunuz.", "Hata",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {

    }
}
