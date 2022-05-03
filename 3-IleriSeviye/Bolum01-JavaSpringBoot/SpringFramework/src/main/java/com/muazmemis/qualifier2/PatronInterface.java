package com.muazmemis.qualifier2;

public interface PatronInterface {

    // @Qualifier : Aynı anda birden fazla proje aktif. Ancak default olarak çalışacak projeyi seçebiliyoruz
    public String surum(String data);
}
