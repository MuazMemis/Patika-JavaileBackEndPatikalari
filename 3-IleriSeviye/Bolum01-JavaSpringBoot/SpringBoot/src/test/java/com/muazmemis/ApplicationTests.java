package com.muazmemis;

import com.muazmemis.data.entity.EmployeeEntity;
import com.muazmemis.data.repository.EmployeeRepository;
import com.muazmemis.test.TestCrud;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ApplicationTests implements TestCrud {

//    @Test
//    void contextLoads() {
//    }

    @Autowired
    EmployeeRepository employeeRepository;

    //CREATE
    @Test
    @Override
    public void testCreate() {
        EmployeeEntity employeeEntity = EmployeeEntity
                .builder()
                .firstName("Muaz Test")
                .lastName("Memiş Test")
                .emailId("test@gmail.com")
                .build();
        employeeRepository.save(employeeEntity);
        //nesne null ise assertionError hatası göndersin
        //1.kayda göre verileri getir
        assertNotNull(employeeRepository.findById(1L).get());
    }

    //LIST
    @Test
    @Override
    public void testList() {
        List<EmployeeEntity> list = employeeRepository.findAll();
        //eğer Sıfırdan büyükse liste vardır
        assertThat(list).size().isGreaterThan(0);
    }

    //FINDBYID
    @Test
    @Override
    public void testFindById() {
        EmployeeEntity employeeEntity = employeeRepository.findById(1L).get();
        // Muaz Test adında kayıt var mı yok mu
        assertEquals("Muaz Test", employeeEntity.getFirstName());
    }

    //UPDATE
    @Test
    @Override
    public void testUpdate() {
        EmployeeEntity employeeEntity = employeeRepository.findById(1L).get();
        employeeEntity.setFirstName("Muaz 44 Test");
        employeeRepository.save(employeeEntity);
        //eşit değilse bir sorun olmayacak ama eşitse exception fırlatsın
        assertNotEquals("Muaz Test", employeeRepository.findById(1L).get().getFirstName());
    }


    //DELETE
    @Test
    @Override
    public void testDelete() {
        employeeRepository.deleteById(1L);
        //isFalse
        assertThat(employeeRepository.existsById(1L)).isFalse();
    }

}
