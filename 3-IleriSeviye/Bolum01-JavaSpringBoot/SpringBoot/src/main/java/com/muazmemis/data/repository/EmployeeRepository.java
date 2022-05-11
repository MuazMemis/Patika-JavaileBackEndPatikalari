package com.muazmemis.data.repository;

import com.muazmemis.data.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository // This is not needed because we are using Spring Data JPA
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}