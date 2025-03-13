package com.zenika.cqtt.controller;

import com.zenika.cqtt.controller.dto.EmployeeDTO;
import com.zenika.cqtt.service.Employee;
import com.zenika.cqtt.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping
    public List<EmployeeDTO> get() {
        return Collections.emptyList();
    }

    @GetMapping("/{id}")
    public EmployeeDTO get(@PathVariable("id") Integer id) {
        Employee employee = service.get(id);
        return new EmployeeDTO(
                employee.firstName(),
                employee.lastName()
        );
    }
}
