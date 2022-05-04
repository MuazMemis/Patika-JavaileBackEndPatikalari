package com.muazmemis.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@Controller
public class PostConstructTutorials {

//    @Autowired
//    Logger LOG;

    // Parametresiz constructor
    // Cannot invoke "java.util.logging.Logger.info(String)" because "this.LOG" is null
//    public PostConstructTutorials() {
//        LOG.info("Log info çağırıldı");
//    }

    // Bean henüz başlamadığından null pointer hatası alınıyor. Bu yüzden bağımlılığı enjekte edemiyoruz.
    // Görevi: Bir bean nesnesi oluşturuldğunda hemen oluşur.
//    @PostConstruct
//    public void init() {
//        LOG.info("Log info çağırıldı");
//    }

//    public static void main(String[] args) {
//        PostConstructTutorials postConstructTutorials = new PostConstructTutorials();
//        System.out.println(postConstructTutorials);
//    }

}
