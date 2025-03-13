package com.zenika.cqtt.service;

import com.zenika.cqtt.repository.EmployeeEntity;
import com.zenika.cqtt.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee get(Integer id) {
        EmployeeEntity employeeEntity = employeeRepository.findById(id).orElseThrow();
        return new Employee(employeeEntity.getFirst_name(), employeeEntity.getLast_name());
    }
}
