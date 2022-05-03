package com.muazmemis.qualifier;

public interface PatronInterface {

    // @Qualifier : Aynı anda birden fazla proje aktif. Ancak default olarak çalışacak projeyi seçebiliyoruz
    public String surum(String data);
}
