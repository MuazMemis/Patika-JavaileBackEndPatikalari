package com.muazmemis.bean;

import com.muazmemis.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public BeanDto beanDto() {
        return BeanDto.builder().id(0L).beanName("Bean Adı").beanData("Bean Data").build();
    }
}
