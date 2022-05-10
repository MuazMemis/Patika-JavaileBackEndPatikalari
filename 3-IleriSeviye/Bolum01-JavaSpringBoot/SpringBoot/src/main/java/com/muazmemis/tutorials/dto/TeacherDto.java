package com.muazmemis.tutorials.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class TeacherDto {

    private Long teacherId;

    @NotEmpty(message = "Ad Soyad alanı boş olamaz.")
    @Size(min = 3, max = 50, message = "Ad Soyad alanı 3-50 karakter arasında olmalı.")
    private String teacherNameSurname;

    @Email(message = "Email adresi geçerli değil.")
    @NotEmpty(message = "E-posta alanı boş olamaz.")
    private String teacherEmail;

    @NotEmpty(message = "Şifre alanı boş olamaz.")
    @Size(min = 3, max = 8, message = "Şifre alanı 3-8 karakter arasında olmalı.")
    private String teacherPassword;

}
