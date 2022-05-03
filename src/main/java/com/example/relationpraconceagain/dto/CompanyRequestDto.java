package com.example.relationpraconceagain.dto;

import com.example.relationpraconceagain.model.CompanyType;
import com.example.relationpraconceagain.model.Employee;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CompanyRequestDto {
    private String name;
    private String companyType;
    private List<EmployeeRequestDto> employeeList;
}
