package com.muazmemis.tutorials.controller;

import com.muazmemis.tutorials.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafController {

    // http://localhost:8080/
    @GetMapping({"/", "/index"}) // optional
    public String index() {
        return "index";
    }

    // http://localhost:8080/thymeleaf1
    @GetMapping("/thymeleaf1")
//    @ResponseBody // Bu anotation olmazsa 500 hatası verir.
    public String getThymeleaf1() {
        return "thymeleaf1";
    }

    // http://localhost:8080/thymeleaf2
    @GetMapping("/thymeleaf2")
    public String getThymeleaf2Model(Model model) {
        model.addAttribute("key_model1", "Ben modelden geldim 1");
        model.addAttribute("key_model2", "Ben modelden geldim 2");
        return "thymeleaf1";
    }

    // http://localhost:8080/thymeleaf3
    @GetMapping("/thymeleaf3")
    public String getThymeleaf3Model(Model model) {
        model.addAttribute("key_model1", "Ben modelden geldim 1");
        model.addAttribute("key_model2", "Ben modelden geldim 2");
        return "thymeleaf_file/thymeleaf3";
    }

    // http://localhost:8080/thymeleaf4
    @GetMapping("/thymeleaf4")
    public String getThymeleaf4Model(Model model) {
        model.addAttribute("key_model1", "Ben modelden geldim 1");
        return "thymeleaf4";
    }

    // ---------------------------------------------------------------
    // Model object göndermek
    // http://localhost:8080/thymeleaf5
    @GetMapping("/thymeleaf5")
    public String getThymeleaf5ModelObject(Model model) {
        model.addAttribute("key_model1", "text");

        ProductDto productDto = ProductDto.builder().productId(0L).productName("Ürün adı").productPrice(2500).build();

        model.addAttribute("key_model2", productDto);

        return "thymeleaf5";
    }

    // http://localhost:8080/thymeleaf6
    @GetMapping("/thymeleaf6")
    public String getThymeleaf6ModelObjectList(Model model) {
        model.addAttribute("key_model1", "text");

        List<ProductDto> listem = new ArrayList<>();
        listem.add(ProductDto.builder().productId(1L).productName("Ürün adı 1").productPrice(2500).build());
        listem.add(ProductDto.builder().productId(2L).productName("Ürün adı 2").productPrice(3500).build());
        listem.add(ProductDto.builder().productId(3L).productName("Ürün adı 3").productPrice(4500).build());
        listem.add(ProductDto.builder().productId(4L).productName("Ürün adı 4").productPrice(5500).build());

        model.addAttribute("product_liste", listem);

        return "thymeleaf6";
    }

    // http://localhost:8080/thymeleaf7
    // http://localhost:8080/thymeleaf7/4
    @GetMapping({"/thymeleaf7/{id}", "/thymeleaf7/"})
    public String getThymeleaf7ModelObject(Model model, @PathVariable(name = "id", required = false) Long id) {
        if (id != null) {
            model.addAttribute("key_model1", "id: " + id);
        } else {
            model.addAttribute("key_model1", "id null gönderildi");
        }

        return "thymeleaf7";
    }

    //@RequestParam
    //http://localhost:8080/thymeleaf8?id=4&name=HamitMizrak
    @GetMapping("/thymeleaf8")
    public String getThymeleaf8ModelObject(Model model, @RequestParam(name = "id", required = false, defaultValue = "0") Long id,
                                           @RequestParam(name = "name") String adi) {
        if (id != null) {
            model.addAttribute("key_model1", "id: " + id + " adı soyadı: " + adi);
        } else {
            model.addAttribute("key_model1", "id bulunmadı");
        }
        
        return "thymeleaf8";
    }

}