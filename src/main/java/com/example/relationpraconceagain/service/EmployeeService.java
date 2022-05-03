package com.example.relationpraconceagain.service;

import com.example.relationpraconceagain.dto.EmployeeRequestDto;
import com.example.relationpraconceagain.dto.EmployeeResponseDto;
import com.example.relationpraconceagain.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);

}
