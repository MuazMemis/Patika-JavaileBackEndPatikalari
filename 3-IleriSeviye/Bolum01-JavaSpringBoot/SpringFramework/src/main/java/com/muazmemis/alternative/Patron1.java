package com.muazmemis.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Patron1 implements PatronInterface {

    @Override
    public String surum(String data) {
        return "Patron 1: " + data;
    }
}
