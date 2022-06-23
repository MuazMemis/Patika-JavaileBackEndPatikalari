package com.muazmemis.aop.decorator;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "decoraterBean")
@ApplicationScoped
public class DecoraterBean {

    @Inject
    IEv iEv;

    public String beanMethod(String data) {
        return iEv.boyama(data);
    }
}
