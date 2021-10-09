package Dersler.Bolum2NesneYonelimliProgramlama.Ders7Interface;

public class Ornek {
}

// interface anahtar kelimesi ile bir interface tipi tanımlanır.
interface PaymentProvider {

    // interface içinde yer alan fonksiyonların hepsi soyuttur.
    // Bu soyut fonksiyonlar interface'den kalıtım alan alt sınıflarda doldurulur.
    public boolean cancelCharge(int chargeId);

    public int charge(double totalPrice);

    public String loadInvoice(int chargeId);

}

class AssecoPaymentSystem implements PaymentProvider {

    @Override
    public boolean cancelCharge(int chargeId) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int charge(double totalPrice) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String loadInvoice(int chargeId) {
        // TODO Auto-generated method stub
        return null;
    }
}

class IyzicoPaymentSystem implements PaymentProvider {

    @Override
    public boolean cancelCharge(int chargeId) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int charge(double totalPrice) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String loadInvoice(int chargeId) {
        // TODO Auto-generated method stub
        return null;
    }
}