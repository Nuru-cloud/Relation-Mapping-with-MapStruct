package com.example.relationpraconceagain.mapstruct;

import com.example.relationpraconceagain.dto.EmployeeRequestDto;
import com.example.relationpraconceagain.dto.EmployeeResponseDto;
import com.example.relationpraconceagain.model.Employee;
import org.mapstruct.*;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, unmappedTargetPolicy = ReportingPolicy.IGNORE, unmappedSourcePolicy =  ReportingPolicy.IGNORE)
public interface EmployeeMapper {

    @Mappings(value = {
     @Mapping(source = "companyId", target = "company.id")
    })
    Employee mapEmployeeRequestDtoEmployee(EmployeeRequestDto employeeRequestDto);
    EmployeeResponseDto mapEmployeeEntitytoEmployeeRequestDto(Employee employee);
}
