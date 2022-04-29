package Dersler.Bolum10DigerFaydaliKonular.Ders4EnumSinifi;

public class Main {
    public static void main(String[] args) {
        System.out.println(Gun.PAZARTESI.getDay());
        System.out.println(Gun.SALI.getDay());

        System.out.println(Day.PAZARTESI.getDay());
        System.out.println(Day.SALI.getDay());

        Day.SALI.getDayName();

    }
}
