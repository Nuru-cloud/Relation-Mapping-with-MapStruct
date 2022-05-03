package com.example.relationpraconceagain.dto;

import com.example.relationpraconceagain.model.Company;
import com.example.relationpraconceagain.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeResponseDto {
    private Integer id;
    private String name;
    private float salary;
    private Company company;

    public EmployeeResponseDto(Employee employee){
        this.setId(employee.getId());
        this.setName(employee.getName());
        this.setSalary(employee.getSalary());
        this.setCompany(employee.getCompany());
    }
}
