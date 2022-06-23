package com.muazmemis.cdi;

import com.muazmemis.StudentDto;
import lombok.Getter;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "newTuto")
@ApplicationScoped
public class _04_New {

    // uretilen
    @Produces
    public String uretilenData(@New StudentDto studentDto) {
        studentDto = StudentDto.builder().studentId(0L).name("Ömer").surname("Kalaycı").build();
        return studentDto.getName();
    }

    @Getter
    @Inject
    private String tuketilenData;
}
