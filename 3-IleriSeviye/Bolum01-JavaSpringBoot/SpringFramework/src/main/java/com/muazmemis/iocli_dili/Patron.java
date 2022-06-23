package com.muazmemis.iocli_dili;

public class Patron implements PatronInterface {

    @Override
    public String surum(String data) {
        return "Surum: " + data;
    }
}
