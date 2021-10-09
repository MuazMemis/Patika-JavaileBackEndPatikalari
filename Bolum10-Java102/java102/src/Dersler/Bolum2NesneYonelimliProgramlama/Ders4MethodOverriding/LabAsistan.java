package Dersler.Bolum2NesneYonelimliProgramlama.Ders4MethodOverriding;

public class LabAsistan extends Asistan {

    public LabAsistan(String adSoyad, String telefon, String eposta, String bolum, String unvan, String ofisSaati) {
        super(adSoyad, telefon, eposta, bolum, unvan, ofisSaati);
    }

    public void lablaraGir() {
        System.out.println(this.getAdSoyad() + " lab'a girdi.");
    }

    @Override
    public void derseGir() {
        System.out.println(this.getAdSoyad() + " lab asistanı derse girdi.");
    }
}
