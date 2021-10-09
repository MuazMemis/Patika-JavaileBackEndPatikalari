package Dersler.Bolum1AccessModifier.Ders4FinalAnahtarSozcugu;

public class Daire {
    public int r;
    public final double PI_SAYISI = 3.14;

    public Daire(int r) {
        this.r = r;
    }

    public void calcArea() {
        double area = this.PI_SAYISI * this.r * this.r;
        System.out.println("Dairenin alanı : " + area);
    }
}
