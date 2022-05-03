package com.muazmemis.qualifier3;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifier3Cdi")
@ApplicationScoped
public class Calisan {

    // Defaultta çalışacak kodlar
//    @Inject
//    private PatronInterface patronInterface;

    // İstediğimiz seçenekler çalışır.
    @Inject
    @QualifierMultiple2(EFazlaSecenekler.BIRINCI)
//    @QualifierMultiple2(EFazlaSecenekler.IKINCI)
//    @QualifierMultiple2(EFazlaSecenekler.UCUNCU)
    private PatronInterface patronInterface;

    public String getData(String data) {
        return patronInterface.surum(data);
    }
}
