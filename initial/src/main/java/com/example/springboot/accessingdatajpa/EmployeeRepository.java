package com.example.springboot.accessingdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
    @Query("SELECT CAMPO FROM TABLA WHERE CAMPO = :miParametro")
    public String findStringByArgument(@Param("miParametro") miParametro);
}
