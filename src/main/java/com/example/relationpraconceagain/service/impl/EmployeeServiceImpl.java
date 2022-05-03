package com.example.relationpraconceagain.service.impl;

import com.example.relationpraconceagain.dto.EmployeeRequestDto;
import com.example.relationpraconceagain.dto.EmployeeResponseDto;
import com.example.relationpraconceagain.model.Company;
import com.example.relationpraconceagain.model.Employee;
import com.example.relationpraconceagain.repo.CompanyRepository;
import com.example.relationpraconceagain.repo.EmployeeRepository;
import com.example.relationpraconceagain.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final CompanyRepository companyRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        Optional<Company> optionalCompany = companyRepository.findById(employee.getCompany().getId());

        if (optionalCompany.isPresent()){
            Company company = optionalCompany.get();
            employee.setCompany(company);
        }
        return employeeRepository.save(employee);
    }
}

