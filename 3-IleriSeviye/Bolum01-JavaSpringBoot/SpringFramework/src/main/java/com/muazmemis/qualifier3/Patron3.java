package com.muazmemis.qualifier3;

@QualifierMultiple2(EFazlaSecenekler.IKINCI)
public class Patron3 implements PatronInterface {

    @Override
    public String surum(String data) {
        return "QualifierMultiple ikinci: " + data;
    }
}
