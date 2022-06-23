package com.muazmemis.qualifier2;

import javax.enterprise.inject.Default;

@Default
public class Patron1 implements PatronInterface {

    // @Alternative : Aynı anda sadece bir tane proje çalışıyor. diğerleri kapatılıyor.
    @Override
    public String surum(String data) {
        return "Default data: " + data;
    }
}
