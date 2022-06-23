package com.muazmemis.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Patron1 implements PatronInterface {

    // @Alternative : Aynı anda sadece bir tane proje çalışıyor. diğerleri kapatılıyor.
    @Override
    public String surum(String data) {
        return "Patron 1: " + data;
    }
}
