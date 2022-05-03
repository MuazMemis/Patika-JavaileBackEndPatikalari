package com.muazmemis.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternativecdi")
@ApplicationScoped
public class Calisan {

    @Inject
    private PatronInterface patronInterface;

    public Calisan() {
//        this.patronInterface = new Patron(); // Yukarıda @Inject kullandığımız için newlemeye gerek yok.
    }

    public String getData(String data) {
        return patronInterface.surum(data);
    }
}
