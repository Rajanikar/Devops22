package com.spring.rest.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.rest.main.dto.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
