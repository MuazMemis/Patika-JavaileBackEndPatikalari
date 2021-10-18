package Dersler.Bolum11PatikaKlonu.Ders2PatikaKlon.com.patikadev;

import Dersler.Bolum11PatikaKlonu.Ders2PatikaKlon.com.patikadev.Helper.Helper;
import Dersler.Bolum11PatikaKlonu.Ders2PatikaKlon.com.patikadev.Model.Operator;
import Dersler.Bolum11PatikaKlonu.Ders2PatikaKlon.com.patikadev.View.OperatorGUI;

public class Main {
    public static void main(String[] args) {
        Helper.setLayout();

        Operator operator = new Operator();
        operator.setName("Muaz Memiş");

        OperatorGUI opGUI = new OperatorGUI(operator);
    }
}
