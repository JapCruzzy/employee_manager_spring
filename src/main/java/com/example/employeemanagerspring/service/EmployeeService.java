package com.example.employeemanagerspring.service;

import com.example.employeemanagerspring.exception.EmployeeNotFoundException;
import com.example.employeemanagerspring.model.Employee;
import com.example.employeemanagerspring.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee findEmployeeById(Long id){
        return employeeRepository.findEmployeeById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee # " +
                id + " can't be found"));
    }

    public Employee updateEmployee (Employee employee){
        return employeeRepository.save(employee);
    }

    @Transactional
    public void deleteEmployee(Long id){
        employeeRepository.deleteEmployeeById(id);
    }
}
