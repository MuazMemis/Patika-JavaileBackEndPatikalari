package com.muazmemis.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Patron2 implements PatronInterface {

    @Override
    public String surum(String data) {
        return "Patron 2: " + data;
    }
}
