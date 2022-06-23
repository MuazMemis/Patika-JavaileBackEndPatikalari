package com.muazmemis.iocsiz_disiz;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "cdisizCalisan")
@ApplicationScoped
public class Calisan {

    private Patron patron;

    public Calisan() {
        this.patron = new Patron();
    }

    public String getData(String data) {
        return patron.surum(data);
    }
}
