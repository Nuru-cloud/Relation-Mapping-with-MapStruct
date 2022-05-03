package com.example.relationpraconceagain.dto;

import com.example.relationpraconceagain.model.Company;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeRequestDto {
    private Integer id;
    private String name;
    private float salary;
    private Integer companyId;
}
