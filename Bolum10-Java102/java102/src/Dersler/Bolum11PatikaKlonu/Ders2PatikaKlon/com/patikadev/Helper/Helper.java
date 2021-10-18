package Dersler.Bolum11PatikaKlonu.Ders2PatikaKlon.com.patikadev.Helper;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Helper {

    public static void setLayout() {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }

    public static int screenCenterPoint(String eksen, Dimension size) {
        int point;
        switch (eksen) {
            case "x" -> point = (Toolkit.getDefaultToolkit().getScreenSize().width - size.width) / 2;
            case "y" -> point = (Toolkit.getDefaultToolkit().getScreenSize().height - size.height) / 2;
            default -> point = 0;
        }
        return point;
    }

    public static boolean isFieldEmpty(JTextField field) {
        boolean result = false;

        if (field.getText().trim().isEmpty())
            result = true;

        return result;
    }

    public static boolean isFieldEmpty(ArrayList<JTextField> fields) {
        boolean result = false;

        for (JTextField field : fields) {
            if (field.getText().trim().isEmpty())
                result = true;
        }

        return result;
    }

    public static void showMessage(String str) {
        optionPaneTR();

        String msg;
        String title;
        switch (str) {
            case "fill" -> {
                msg = "Tüm alanları doldurunuz!";
                title = "Hata!";
            }
            case "done" -> {
                msg = "İşlem başarılı";
                title = "Sonuç";
            }
            case "error" -> {
                msg = "Bir hata oluştu.";
                title = "Hata!";
            }
            default -> {
                msg = str;
                title = "Mesaj";
            }
        }

        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void optionPaneTR() {
        UIManager.put("OptionPane.okButtonText", "Tamam");
    }

}
