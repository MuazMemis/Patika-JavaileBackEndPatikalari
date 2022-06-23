package com.muazmemis.cdi;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named(value = "injectTuto")
public class _03_Inject {

    @Inject
    List<String> tuketen;

    public List<String> getTuketen() {
        return tuketen;
    }
}
