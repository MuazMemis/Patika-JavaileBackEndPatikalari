package Dersler.Bolum2NesneYonelimliProgramlama.Ders5Polymorphism;

public class Ornek2 {
    public static void konustur(Object object) {

        if (object instanceof Kopek2) {
            Kopek2 kopekTest = (Kopek2) object;
            System.out.println(kopekTest.konus());
        } else if (object instanceof Kedi2) {
            Kedi2 kediTest = (Kedi2) object;
            System.out.println(kediTest.konus());
        } else if (object instanceof At2) {
            At2 atTest = (At2) object;
            System.out.println(atTest.konus());
        } else if (object instanceof Hayvan2) {
            Hayvan2 hayvan2Test = (Hayvan2) object;
            System.out.println(hayvan2Test.konus());
        }
    }

    public static void main(String[] args) {

        // Temel Gösterim
        Kedi2 kedi = new Kedi2("Nasip");

        if (kedi instanceof Kedi2) {
            System.out.println("Bu nesne Kedi sınıfından");
        }

        if (kedi instanceof Hayvan2) {
            System.out.println("Bu nesne Hayvan sınıfından");
        }

        //Fonksiyon ile gösterim

        Kedi2 kedii = new Kedi2("Nasip");
        Kopek2 kopek = new Kopek2("Zizu");
        At2 at = new At2("BoldPilot");
        Hayvan2 hayvan2 = new Hayvan2("Turunç");

        konustur(kedii);
        konustur(kopek);
        konustur(at);
        konustur(hayvan2);
    }

}

class Hayvan2 {
    private String isim;

    public Hayvan2(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String konus() {
        return "Hayvan Konuşuyor...";
    }
}

class Kedi2 extends Hayvan2 {

    public Kedi2(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Miyavlıyor...";
    }
}

class Kopek2 extends Hayvan2 {

    public Kopek2(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Havlıyor...";
    }
}

class At2 extends Hayvan2 {

    public At2(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Kişniyor...";
    }
}
