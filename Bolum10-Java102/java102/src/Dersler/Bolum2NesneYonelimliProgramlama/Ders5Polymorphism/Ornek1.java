package Dersler.Bolum2NesneYonelimliProgramlama.Ders5Polymorphism;

public class Ornek1 {
    public static void konustur(Hayvan2 hayvan2){
        System.out.println(hayvan2.konus());
    }

    public static void main(String[] args){
        // İlk Gösterim
        Hayvan2 hayvan = new Hayvan2("Hiper");
        System.out.println(hayvan.konus());
        Hayvan2 hayvan21 = new Kedi2("Hiper");
        System.out.println(hayvan21.konus());
        Hayvan2 hayvan2 = new Kopek2("Hiper");
        System.out.println(hayvan2.konus());
        Hayvan2 hayvan23 = new At2("Hiper");
        System.out.println(hayvan23.konus());

        //Fonksiyon kullanarak gösterim
        konustur(new Kedi2("Nasip"));
        konustur(new Kopek2("Karabaş"));
        konustur(new At2("Bold-Pilot"));
    }
}

class Hayvan{
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String konus(){
        return "Hayvan Konuşuyor...";
    }
}

class Kedi extends Hayvan2 {

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Miyavlıyor...";
    }
}

class Kopek extends Hayvan2 {

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Havlıyor...";
    }
}

class At extends Hayvan2 {

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Kişniyor...";
    }
}
