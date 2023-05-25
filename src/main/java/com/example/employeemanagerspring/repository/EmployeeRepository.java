package com.example.employeemanagerspring.repository;


import com.example.employeemanagerspring.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    void deleteEmployeeById(Long id);

    @Query("select e from employee e where e.id = ?1")
    Optional<Employee> findEmployeeById(Long id);
}
