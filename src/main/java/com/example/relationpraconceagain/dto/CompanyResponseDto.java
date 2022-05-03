package com.example.relationpraconceagain.dto;

import com.example.relationpraconceagain.model.Company;
import com.example.relationpraconceagain.model.CompanyType;
import com.example.relationpraconceagain.model.Employee;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class CompanyResponseDto {
    private Integer id;
    private String name;
    private CompanyType companyType;
    private List<Employee> employeeList;

    public CompanyResponseDto(Company company){
        this.setId(company.getId());
        this.setName(company.getName());
        this.setCompanyType(company.getCompanyType());
        this.setEmployeeList(company.getEmployeeList());
    }
}
