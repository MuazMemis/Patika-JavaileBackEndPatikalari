package com.muazmemis.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named("produceTutorial")
@ApplicationScoped

public class _02_Produces {

    @Produces // Üretiyor
    public List<String> getList() {
        List<String> list = new ArrayList<>();
        list.add("Html5");
        list.add("CSS3");
        list.add("JavaScript");
        list.add("React");
        list.add("Angular");
        list.add("Vue");
        return list;
    }
}
